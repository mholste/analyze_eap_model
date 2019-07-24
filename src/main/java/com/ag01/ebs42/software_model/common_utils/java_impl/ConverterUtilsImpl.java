package com.ag01.ebs42.software_model.common_utils.java_impl;

import com.ag01.ebs42.model.utils.api.ConverterUtils;

public class ConverterUtilsImpl implements ConverterUtils {

	@Override
	public long convertEaGuidToUId(String eaGuId) {
		long resultUId = 0L;
		
		if((eaGuId != null) && (eaGuId.isEmpty() == false)) {
			String tmpEaGuId = eaGuId.replaceAll("-", "");
			byte[] tmpEaGuIdByteArray = new byte[32];
			
			tmpEaGuIdByteArray = tmpEaGuId.getBytes();
	        for(int i = 0; i < tmpEaGuIdByteArray.length; i++) {
	        	resultUId = resultUId << 8;
	        	resultUId += tmpEaGuIdByteArray[i];
	        }
		}
		
		return  resultUId;
	}

}
