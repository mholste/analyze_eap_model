package com.ag01.ebs42.software_model.standalone_application_main;

public class tmpTest {

	public static void main(String[] args) {
		
		String test = "63D3D5BA-3280-4173-8F9E-E81ED78F7105";
		long result = convertEaGuidToUId(test);
		System.out.println("long ist " + result);

	}

	public static long convertEaGuidToUId(String eaGuId) {
		long resultUId = 0L;
		
		String tmpEaGuId = eaGuId.replaceAll("-", "");
		byte[] tmpEaGuIdByteArray = new byte[32];
		
		tmpEaGuIdByteArray = tmpEaGuId.getBytes();
        for(int i = 0; i < tmpEaGuIdByteArray.length; i++) {
        	resultUId = resultUId << 8;
        	resultUId += tmpEaGuIdByteArray[i];
        }
        
		return  resultUId;
	}

}
