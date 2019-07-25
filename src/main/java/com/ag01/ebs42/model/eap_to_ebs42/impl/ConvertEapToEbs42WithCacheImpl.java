package com.ag01.ebs42.model.eap_to_ebs42.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ag01.ebs42.analyze.dbaccess.dao.api.CompleteEapDatabase;
import com.ag01.ebs42.analyze.dbaccess.domobj.CompleteEabDatabaseDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;
import com.ag01.ebs42.model.arc42.domobj.Arc42ModelRootDo;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemComponentImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemDoImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterface;
import com.ag01.ebs42.model.arc42.domobj.Bpa42ModelRootDo;
import com.ag01.ebs42.model.arc42.domobj.Ebs42ModelRootDo;
import com.ag01.ebs42.model.arc42.domobj.Ted42ModelRootDo;
import com.ag01.ebs42.model.eap_to_ebs42.api.ConvertEapToEbs42;
import com.ag01.ebs42.model.eap_to_ebs42.domobj.TobjectDoElementDo;
import com.ag01.ebs42.model.eap_to_ebs42.domobj.TpackageDoElementDo;
import com.ag01.ebs42.model.utils.api.ConverterUtils;

public class ConvertEapToEbs42WithCacheImpl implements ConvertEapToEbs42 {
	
	private static Logger LOGGER = LogManager.getLogger(ConvertEapToEbs42WithCacheImpl.class);
	
	private ConverterUtils converterUtils;
	private CompleteEapDatabase completeEapDatabase;

	private Map<Integer, TpackageDoElementDo> tpackageDoHashMapCache;
	private Map<Integer, TobjectDoElementDo> tobjectDoHashMapCache;
	
	private TpackageDoElementDo tpackageDoTreeRoot;

	public void setConverterUtils(ConverterUtils converterUtils) {
		this.converterUtils = converterUtils ;
	}

	public void setCompleteEapDatabase(CompleteEapDatabase completeEapDatabase) {
		this.completeEapDatabase = completeEapDatabase;
	}

	@Override
	public Ebs42ModelRootDo convertEapToEbs42() throws Exception {
		Ebs42ModelRootDo ebs42ModelRootDo = null;

		CompleteEabDatabaseDo completeEabDatabaseDo = completeEapDatabase.readCompleteEabDatabase();
		
		if(completeEabDatabaseDo != null) {
			fillTpackageDoHashMapCache(completeEabDatabaseDo);
			fillTobjectDoHashMapCache(completeEabDatabaseDo);
			setTpackageTreeRootElement(completeEabDatabaseDo);
			linkTpackageDoTreeRoot(completeEabDatabaseDo);
			linkTpackagesTobjectDoToTpackageTree(completeEabDatabaseDo);
			ebs42ModelRootDo = createInitialEbs42ModelTreeStructure();
		} else {
			LOGGER.error("no element on the eap database found");
			throw new Exception("no element on the eap database found");
		}
		
		return ebs42ModelRootDo;
	}
	
	private void fillTpackageDoHashMapCache(CompleteEabDatabaseDo completeEabDatabaseDo) throws Exception {
		List <TpackageDo> tpackageDoList = completeEabDatabaseDo.getTpackageDoList();

		if((tpackageDoList != null) && (tpackageDoList.isEmpty() == false)) {
			int packageHashSize =  tpackageDoList.size();
			this.tpackageDoHashMapCache = new HashMap<Integer, TpackageDoElementDo>(packageHashSize + 10);
					
			for(int i = 0; i < tpackageDoList.size(); i++) {
				TpackageDo tpackageDo = tpackageDoList.get(i);
				int tpackageDoId = tpackageDo.getPackageid();
				TpackageDoElementDo tpackageDoElementDo = new TpackageDoElementDo();
				tpackageDoElementDo.setElement(tpackageDo);
				this.tpackageDoHashMapCache.put(tpackageDoId, tpackageDoElementDo);
			}
		} else {
			LOGGER.error("no complet information in completeEabDatabaseDo");
			throw new Exception("no complet information in ");
		}
	}

	private void fillTobjectDoHashMapCache(CompleteEabDatabaseDo completeEabDatabaseDo) throws Exception {
		List <TobjectDo> tobjectDoList = completeEabDatabaseDo.getTobjectDoList();
		if((tobjectDoList != null) && (tobjectDoList.isEmpty() == false)) {
			int objectHashSize = tobjectDoList.size();
			this.tobjectDoHashMapCache = new HashMap<Integer, TobjectDoElementDo> (objectHashSize + 10);
			
			for(int i = 0; i < tobjectDoList.size(); i++) {
				TobjectDo TobjectDo = tobjectDoList.get(i);
				int tobjectDoId = TobjectDo.getObjectid();
				TobjectDoElementDo tobjectDoElementDo = new TobjectDoElementDo();
				tobjectDoElementDo.setElement(TobjectDo);
				this.tobjectDoHashMapCache.put(tobjectDoId, tobjectDoElementDo);
			}
		} else {
			LOGGER.error("no complet information in completeEabDatabaseDo");
			throw new Exception("no complet information in ");
		}
	}
	
	private void setTpackageTreeRootElement(CompleteEabDatabaseDo completeEabDatabaseDo) throws Exception {
		TpackageDoElementDo tpackageDoRoot = null;
		
		List <TpackageDo> tpackageDoList = completeEabDatabaseDo.getTpackageDoList();
		
		for(int i = 0; i < tpackageDoList.size(); i++) {
			TpackageDo tpackageDo = tpackageDoList.get(i);
			if(tpackageDo != null) {
				if(("ebs42_model".equals(tpackageDo.getName()) && (tpackageDo.getParentid() == 0))) {
					int tpackageDoRootId = tpackageDo.getPackageid();
					tpackageDoRoot = this.tpackageDoHashMapCache.get(tpackageDoRootId);
					this.tpackageDoTreeRoot = tpackageDoRoot;
					break;
				}
			}
		}
		if(tpackageDoRoot == null) {
			LOGGER.error("no root element for tpackage tree found");
			throw new Exception("no root element for tpackage tree found");
		}
	}
	
	private void linkTpackageDoTreeRoot(CompleteEabDatabaseDo completeEabDatabaseDo) throws Exception {
		List <TpackageDo> tpackageDoList = completeEabDatabaseDo.getTpackageDoList();
		for(int i = 0; i < tpackageDoList.size(); i++) {
			TpackageDo tpackageDo = tpackageDoList.get(i);
			int tpackageDoId = tpackageDo.getPackageid();
			int tpackageParentDoId = tpackageDo.getParentid();
			TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(tpackageDoId);
			if(tpackageParentDoId != 0) {
				TpackageDoElementDo tpackageParentDoElementDo = this.tpackageDoHashMapCache.get(tpackageParentDoId);
				tpackageDoElementDo.setParent(tpackageParentDoElementDo);
				tpackageParentDoElementDo.getChildren().add(tpackageDoElementDo);
			}
		}
	}
	
	private void linkTpackagesTobjectDoToTpackageTree(CompleteEabDatabaseDo completeEabDatabaseDo) throws Exception {
		List <TobjectDo> tobjectDoList = completeEabDatabaseDo.getTobjectDoList();
		for(int i = 0; i < tobjectDoList.size(); i++) {
			TobjectDo tobjectDo = tobjectDoList.get(i);
			String tobjectType = tobjectDo.getObjecttype();
			if("Package".equals(tobjectType)) {
				int tpackageDoId = tobjectDo.getPackageid(); // id of the parent tpackage
				int pdata1 = Integer.parseInt(tobjectDo.getPdata1()); // id of the tpackage
				TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(pdata1);
				if(tpackageDoElementDo.getParent().getElement().getPackageid() == tpackageDoId) {
					tpackageDoElementDo.setElementObject(tobjectDo);
				} else {
					LOGGER.error("there is a package mismatch between tobject.packages " + tobjectDo + " and tpackages " + tpackageDoElementDo.getElementObject());
					throw new Exception("there is a package mismatch between tobject.packages " + tobjectDo + " and tpackages " + tpackageDoElementDo.getElementObject());
				}
			} else if("Component".equals(tobjectType)) {
				int tpackageDoId = tobjectDo.getPackageid(); 
				TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(tpackageDoId);
				tpackageDoElementDo.getDependentComponentObjects().add(tobjectDo);				
			} else if("Interface".equals(tobjectType)) {
				int tpackageDoId = tobjectDo.getPackageid(); 
				TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(tpackageDoId);
				tpackageDoElementDo.getDependentInterfaceObjects().add(tobjectDo);
			} else if("ProvidedInterface".equals(tobjectType)) {
				int tpackageDoId = tobjectDo.getPackageid(); 
				TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(tpackageDoId);
				tpackageDoElementDo.getDependentProvidedInterfaceObjects().add(tobjectDo);
			} else if("RequiredInterface".equals(tobjectType)) {
				int tpackageDoId = tobjectDo.getPackageid(); 
				TpackageDoElementDo tpackageDoElementDo = this.tpackageDoHashMapCache.get(tpackageDoId);
				tpackageDoElementDo.getDependentActorObjects().add(tobjectDo);
			} else if("Actor".equals(tobjectType)) {
			
			}
		}
	}
	
	Ebs42ModelRootDo createInitialEbs42ModelTreeStructure() throws Exception {
		Ebs42ModelRootDo ebs42ModelRootDo = null;
		
		ebs42ModelRootDo = createEbs42ModelRoot();
		
		return ebs42ModelRootDo;
	}
	
	private Ebs42ModelRootDo createEbs42ModelRoot() throws Exception {
		Ebs42ModelRootDo ebs42ModelRootDo = null;
		
		TpackageDo ebs42ModelRootEapPackage = null;
		
		ebs42ModelRootEapPackage = tpackageDoTreeRoot.getElement();
		if(ebs42ModelRootEapPackage != null) {
			long uId = converterUtils.convertEaGuidToUId(ebs42ModelRootEapPackage.getEaguid());
			ebs42ModelRootDo = new Ebs42ModelRootDo();
			ebs42ModelRootDo.setuId(uId);
		} else {
			LOGGER.error("no element for Ebs42ModelRootDo found");
			throw new Exception("no element for Ebs42ModelRootDo found");
		}
		
		Bpa42ModelRootDo bpa42ModelRootDo = createBpa42ModelRoot();
		if(bpa42ModelRootDo != null) {
			ebs42ModelRootDo.setBpa42ModelRootDo(bpa42ModelRootDo);
		} else {
			LOGGER.warn("no element for Bpa42ModelRootDo found");
		}

		Arc42ModelRootDo arc42ModelRootDo = createArc42ModelRoot();
		if(arc42ModelRootDo != null) {
			ebs42ModelRootDo.setArc42ModelRootDo(arc42ModelRootDo);
		} else {
			LOGGER.warn("no element for Arc42ModelRootDo found");
		}

		Ted42ModelRootDo ted42ModelRootDo = createTed42ModelRoot();
		if(ted42ModelRootDo != null) {
			ebs42ModelRootDo.setTed42ModelRootDo(ted42ModelRootDo);
		} else {
			LOGGER.warn("no element for Ted42ModelRootDo found");
		}
		
		if(arc42ModelRootDo != null) {
			List <Arc42SystemDoImpl> listOfArc42SystemDo = createArc42SystemList();
			arc42ModelRootDo.setArc42SystemsList(listOfArc42SystemDo);
		}

		return ebs42ModelRootDo;
	}
	
	private Bpa42ModelRootDo createBpa42ModelRoot() throws Exception {
		Bpa42ModelRootDo bpa42ModelRootDo = null;
		
		TpackageDo bpa42ModelRootEapPackage = null;
		TobjectDo bpa42ModelRootEapObject = null;
		
		for(int i = 0; i < this.tpackageDoTreeRoot.getChildren().size(); i++) {
			TpackageDoElementDo tmpBpa42TpackageDoElementDo = this.tpackageDoTreeRoot.getChildren().get(i);
			TpackageDo tmpBpa42TpackageDo = tmpBpa42TpackageDoElementDo.getElement();
			TobjectDo tmpBpa42TobjectDo = tmpBpa42TpackageDoElementDo.getElementObject();
			if(("10_BPA42".equals(tmpBpa42TpackageDo.getName())) && ("10_BPA42".equals(tmpBpa42TobjectDo.getName()))) {
				bpa42ModelRootEapPackage = tmpBpa42TpackageDo;
				bpa42ModelRootEapObject = tmpBpa42TobjectDo;
				break;
			}
		}

		if((bpa42ModelRootEapPackage != null) && (bpa42ModelRootEapObject != null)) {
			long uId = converterUtils.convertEaGuidToUId(bpa42ModelRootEapObject.getEaguid());
			bpa42ModelRootDo = new Bpa42ModelRootDo();
			bpa42ModelRootDo.setuId(uId);
		}
		
		return bpa42ModelRootDo;
	}

	private Arc42ModelRootDo createArc42ModelRoot() throws Exception {
		Arc42ModelRootDo arc42ModelRootDo = null;
		
		TpackageDo arc42ModelRootEapPackage = null;
		TobjectDo arc42ModelRootEapObject = null;
		
		for(int i = 0; i < this.tpackageDoTreeRoot.getChildren().size(); i++) {
			TpackageDoElementDo tmpArc42TpackageDoElementDo = this.tpackageDoTreeRoot.getChildren().get(i);
			TpackageDo tmpArc42TpackageDo = tmpArc42TpackageDoElementDo.getElement();
			TobjectDo tmpArc42TobjectDo = tmpArc42TpackageDoElementDo.getElementObject();
			if(("20_ARC42".equals(tmpArc42TpackageDo.getName())) && ("20_ARC42".equals(tmpArc42TobjectDo.getName()))) {
				arc42ModelRootEapPackage = tmpArc42TpackageDo;
				arc42ModelRootEapObject = tmpArc42TobjectDo;
				break;
			}
		}

		if((arc42ModelRootEapPackage != null) && (arc42ModelRootEapObject != null)) {
			long uId = converterUtils.convertEaGuidToUId(arc42ModelRootEapObject.getEaguid());
			arc42ModelRootDo = new Arc42ModelRootDo();
			arc42ModelRootDo.setuId(uId);
		}
		
		return arc42ModelRootDo;
	}

	private Ted42ModelRootDo createTed42ModelRoot() throws Exception {
		Ted42ModelRootDo ted42ModelRootDo = null;
		
		TpackageDo tec42ModelRootEapPackage = null;
		TobjectDo ted42ModelRootEapObject = null;
		
		for(int i = 0; i < this.tpackageDoTreeRoot.getChildren().size(); i++) {
			TpackageDoElementDo tmpTed42TpackageDoElementDo = this.tpackageDoTreeRoot.getChildren().get(i);
			TpackageDo tmpTed42TpackageDo = tmpTed42TpackageDoElementDo.getElement();
			TobjectDo tmpTed42TobjectDo = tmpTed42TpackageDoElementDo.getElementObject();
			if(("30_TED42".equals(tmpTed42TpackageDo.getName())) && ("30_TED42".equals(tmpTed42TobjectDo.getName()))) {
				tec42ModelRootEapPackage = tmpTed42TpackageDo;
				ted42ModelRootEapObject = tmpTed42TobjectDo;
				break;
			}
		}

		if((tec42ModelRootEapPackage != null) && (ted42ModelRootEapObject != null)) {
			long uId = converterUtils.convertEaGuidToUId(ted42ModelRootEapObject.getEaguid());
			ted42ModelRootDo = new Ted42ModelRootDo();
			ted42ModelRootDo.setuId(uId);
		}
		
		return ted42ModelRootDo;
	}
	
	private List <Arc42SystemDoImpl> createArc42SystemList() throws Exception {
		List <Arc42SystemDoImpl> arc42SystemDoList = new ArrayList <Arc42SystemDoImpl>();
		
		// list of all arc42 system packages
		List <TpackageDoElementDo> arc42SystemRootListTpackageDoElementDo = getArc42SystemRootListTpackageDoElementDo();
		if(arc42SystemRootListTpackageDoElementDo == null) {
			return arc42SystemDoList;
		}
		
		// now analyze the system.80_elements.system structure to find the system(s)
		List<TpackageDoElementDo> elements80PackagesArc42SystemRootListTpackageDoElementDo = getElements80PackagesArc42SystemRootListTpackageDoElementDo(arc42SystemRootListTpackageDoElementDo);
		if(elements80PackagesArc42SystemRootListTpackageDoElementDo == null) {
			return arc42SystemDoList;
		}
		
		for (int i = 0; i < elements80PackagesArc42SystemRootListTpackageDoElementDo.size(); i++) {
			TpackageDoElementDo tmpArc42System80ElementTpackageDoElementDo = elements80PackagesArc42SystemRootListTpackageDoElementDo.get(i);
			TobjectDo tmpArc42System80Element = tmpArc42System80ElementTpackageDoElementDo.getElementObject();
			String tobjectType = tmpArc42System80Element.getObjecttype();
			Arc42SystemDoImpl arc42SystemDo = new Arc42SystemDoImpl();

			// all packages in 80_elements are base packages for the arc42 systems
			if ("Package".equals(tobjectType)) {
				// a package element in 80_element of a system directory is a system
				long systemUId = converterUtils.convertEaGuidToUId(tmpArc42System80Element.getEaguid());
				arc42SystemDo.setuId(systemUId);
				String systemName = tmpArc42System80Element.getName();
				arc42SystemDo.setSystemName(systemName);
				String systemPackagesName = tmpArc42System80ElementTpackageDoElementDo.getElement().getName();
				arc42SystemDo.setSystemPackageName(systemPackagesName);
				arc42SystemDoList.add(arc42SystemDo);

				// find all object in the packages
				List<Arc42SystemComponent> systemComponentList = new ArrayList<Arc42SystemComponentImpl>();
				List<Arc42SystemInterface> systemInterfaceList = new ArrayList<Arc42SystemInterface>();
				// search all wanted objects
				for (int l = 0; l < tmpArc42System80ElementTpackageDoElementDo.getDependentComponentObjects().size(); l++) {
					TobjectDo tmpArc42System80ElementSystemTobjectDo = tmpArc42System80ElementTpackageDoElementDo.getDependentComponentObjects().get(l);
					Arc42SystemComponentImpl arc42SystemComponent = new Arc42SystemComponentImpl();
					long componentUId = converterUtils.convertEaGuidToUId(tmpArc42System80ElementSystemTobjectDo.getEaguid());
					arc42SystemComponent.setuId(componentUId);
					String systemComponentName = tmpArc42System80ElementSystemTobjectDo.getName();
					arc42SystemComponent.setSystemComponentName(systemComponentName);
					String systemPackageName = this.tpackageDoHashMapCache.get(tmpArc42System80ElementSystemTobjectDo.getPackageid()).getElement().getName();
					arc42SystemComponent.setPackageName(systemPackageName);
					arc42SystemComponent.setBaseSystem(arc42SystemDo);
					systemComponentList.add(arc42SystemComponent);
				}
				// search all wanted packages
				for (int l = 0; l < tmpArc42System80ElementTpackageDoElementDo.getDependentInterfaceObjects().size(); l++) {
					TobjectDo tmpArc42System80ElementSystemTobjectDo = tmpArc42System80ElementTpackageDoElementDo.getDependentInterfaceObjects().get(l);
					Arc42SystemInterface arc42SystemInterface = new Arc42SystemInterface();
					long uId = converterUtils.convertEaGuidToUId(tmpArc42System80ElementSystemTobjectDo.getEaguid());
					arc42SystemInterface.setuId(uId);
					String systemInterfaceName = tmpArc42System80ElementSystemTobjectDo.getName();
					arc42SystemInterface.setSystemInterfaceName(systemInterfaceName);
					String systemPackageName = this.tpackageDoHashMapCache.get(tmpArc42System80ElementSystemTobjectDo.getPackageid()).getElement().getName();
					arc42SystemInterface.setPackageName(systemPackageName);
					arc42SystemInterface.setDefindedInSystem(arc42SystemDo);
					systemInterfaceList.add(arc42SystemInterface);

				}
				arc42SystemDo.setSystemComponentList(systemComponentList);
				arc42SystemDo.setSystemInterfaceList(systemInterfaceList);
			}
		}

		return arc42SystemDoList;
	}

	// list of all arc42 system packages
	private List <TpackageDoElementDo> getArc42SystemRootListTpackageDoElementDo() throws Exception {
		List <TpackageDoElementDo> arc42SystemRootListTpackageDoElementDo = new ArrayList <TpackageDoElementDo> ();
		
		// find all arc42 system packages and store them in a list 
		for(int i = 0; i < this.tpackageDoTreeRoot.getChildren().size(); i++) {
			TpackageDoElementDo tmpArc42TpackageDoElementDo = this.tpackageDoTreeRoot.getChildren().get(i);
			TpackageDo tmpArc42TpackageDo = tmpArc42TpackageDoElementDo.getElement();
			TobjectDo tmpArc42TobjectDo = tmpArc42TpackageDoElementDo.getElementObject();
			if(("20_ARC42".equals(tmpArc42TpackageDo.getName())) && ("20_ARC42".equals(tmpArc42TobjectDo.getName()))) {
				// all packages below ebs42_model.20_ARC42
				for(int j = 0; j < tmpArc42TpackageDoElementDo.getChildren().size(); j++) {
					TpackageDoElementDo tmpArc42SystemRootTpackageDoElementDo = tmpArc42TpackageDoElementDo.getChildren().get(j);
					TpackageDo tmpArc42SystemRootTpackageDo = tmpArc42SystemRootTpackageDoElementDo.getElement();
					if("50_systems".equals(tmpArc42SystemRootTpackageDo.getName())) {
						// all packages below ebs42_model.20_ARC42.50_systems are the systems
						for(int k = 0; k < tmpArc42SystemRootTpackageDoElementDo.getChildren().size(); k++) {
							TpackageDoElementDo tmpArc42SystemTpackageDoElementDo = tmpArc42SystemRootTpackageDoElementDo.getChildren().get(k);
							arc42SystemRootListTpackageDoElementDo.add(tmpArc42SystemTpackageDoElementDo);
							
						}
					} else if("70_external_systems".equals(tmpArc42SystemRootTpackageDo.getName())) {
						// all packages below ebs42_model.20_ARC42.70_external_systems are the systems
						for(int k = 0; k < tmpArc42SystemRootTpackageDoElementDo.getChildren().size(); k++) {
							TpackageDoElementDo tmpArc42SystemTpackageDoElementDo = tmpArc42SystemRootTpackageDoElementDo.getChildren().get(k);
							arc42SystemRootListTpackageDoElementDo.add(tmpArc42SystemTpackageDoElementDo);
							
						}
					} else if("91_tmp_elements".equals(tmpArc42SystemRootTpackageDo.getName())) {
						// all packages below ebs42_model.20_ARC42.91_tmp_elements are the systems
						for(int k = 0; k < tmpArc42SystemRootTpackageDoElementDo.getChildren().size(); k++) {
							TpackageDoElementDo tmpArc42SystemTpackageDoElementDo = tmpArc42SystemRootTpackageDoElementDo.getChildren().get(k);
							arc42SystemRootListTpackageDoElementDo.add(tmpArc42SystemTpackageDoElementDo);							
						}
					}
				}
			}
		}

		return arc42SystemRootListTpackageDoElementDo;
	}

	// list of all arc42 packages in 80_elements in arc42 system packages
	private List <TpackageDoElementDo> getElements80PackagesArc42SystemRootListTpackageDoElementDo(List <TpackageDoElementDo> arc42SystemRootListTpackageDoElementDo) throws Exception {		
		List <TpackageDoElementDo> elements80PackagesArc42SystemRootListTpackageDoElementDo = new ArrayList <TpackageDoElementDo> ();
		
		if(arc42SystemRootListTpackageDoElementDo == null) {
			return elements80PackagesArc42SystemRootListTpackageDoElementDo;
		}
		
		// analyze the system.80_elements.system structure to find the systems
		for(int i = 0; i < arc42SystemRootListTpackageDoElementDo.size(); i++) {
			TpackageDoElementDo tmpArc42SystemTpackageDoElementDo = arc42SystemRootListTpackageDoElementDo.get(i);
			for(int j = 0; j < tmpArc42SystemTpackageDoElementDo.getChildren().size(); j++) {				
				TpackageDoElementDo tmpArc42System80ElementsTpackageDoElementDo = tmpArc42SystemTpackageDoElementDo.getChildren().get(j);
				TpackageDo tmpArc42System80ElementsTpackageDo = tmpArc42System80ElementsTpackageDoElementDo.getElement();
				
				// all 80_element need, ignore the rest
				if("80_elements".equals(tmpArc42System80ElementsTpackageDo.getName())) {
					for(int k = 0; k < tmpArc42System80ElementsTpackageDoElementDo.getChildren().size(); k++) {
						TpackageDoElementDo tmpArc42System80ElementTpackageDoElementDo = tmpArc42System80ElementsTpackageDoElementDo.getChildren().get(k);
						TobjectDo tmpArc42System80Element = tmpArc42System80ElementTpackageDoElementDo.getElementObject();
						String tobjectType = tmpArc42System80Element.getObjecttype();						
						// all packages in 80_elements are base packages for the arc42 systems, here we need this
						if("Package".equals(tobjectType)) {
							elements80PackagesArc42SystemRootListTpackageDoElementDo.add(tmpArc42System80ElementTpackageDoElementDo);
						}
					}
				}
			}
		}

		return elements80PackagesArc42SystemRootListTpackageDoElementDo;
	}

}
