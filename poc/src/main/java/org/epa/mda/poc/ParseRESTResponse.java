package org.epa.mda.poc;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ParseRESTResponse {

	static KieBase kbase;
	static KieSession ksession;

	public static Company parseResponse(Company company, String restOutput) {
		if (company == null) { company = new Company(); }

		System.out.println("Here is what came back from the REST call: " + restOutput);
		try {
			ksession = readKnowledgeBase();
//restOutput = "<Results><FRSFacility><RegistryId>110012168359</RegistryId><FacilityName>VFL TECHNOLOGY CORPORATION - PORTABLE 61434</FacilityName><LocationAddress>538 OYSTER POINT ROAD</LocationAddress><SupplementalLocation/><CityName>NEWPORT NEWS</CityName><CountyName>NEWPORT NEWS CITY</CountyName><StateAbbr>VA</StateAbbr><ZipCode>23602-6920</ZipCode><FIPSCode>51700</FIPSCode><Latitude83>37.10338</Latitude83><Longitude83>-76.49904</Longitude83></FRSFacility></Results>";
			String [] splitArray = restOutput.split("</*\\w+/*>");
			if (splitArray != null) {
				for (int i = 0; i < splitArray.length; i++) {
					System.out.println(i + " " + splitArray[i]);
				}
				System.out.println("Setting " + splitArray.length + " values");
				company.setId(splitArray[3]);
				company.setName(splitArray[5]);
				company.setAddress(splitArray[7]);
				company.setSupplementalLocation(splitArray[9]);
				company.setCity(splitArray[11]);
				company.setCounty(splitArray[13]);
				company.setState(splitArray[15]);
				company.setZip(splitArray[17]);
				company.setFipsCode(splitArray[19]);
				company.setLatitude(splitArray[21]);
				company.setLongitude(splitArray[23]);
			}
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return company;
	}

	private static KieSession readKnowledgeBase() throws Exception {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession();

		return kSession;
	}

}
