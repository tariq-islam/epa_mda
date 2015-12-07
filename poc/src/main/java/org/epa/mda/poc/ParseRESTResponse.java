package org.epa.mda.poc;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ParseRESTResponse {

	static KieBase kbase;
	static KieSession ksession;

	public static Company parseResponse(Company company, String restOutput) {
		System.out.println("Here is what came back from the REST call: " + restOutput);
		try {
			ksession = readKnowledgeBase();
//restOutput = "<Results><FRSFacility><RegistryId>110012168359</RegistryId><FacilityName>VFL TECHNOLOGY CORPORATION - PORTABLE 61434</FacilityName><LocationAddress>538 OYSTER POINT ROAD</LocationAddress><SupplementalLocation/><CityName>NEWPORT NEWS</CityName><CountyName>NEWPORT NEWS CITY</CountyName><StateAbbr>VA</StateAbbr><ZipCode>23602-6920</ZipCode><FIPSCode>51700</FIPSCode><Latitude83>37.10338</Latitude83><Longitude83>-76.49904</Longitude83></FRSFacility></Results>";
			String [] splitArray = restOutput.split("</*\\w+/*>");
			if (splitArray != null) {
				for (int i = 0; i < splitArray.length; i++) {
					System.out.println(i + " " + splitArray[i]);
				}
				company.setId(splitArray[3]);
				company.setName(splitArray[5]);
				company.setAddress(splitArray[7]);
				company.setSupplementalLocation("");
				company.setCity(splitArray[10]);
				company.setCounty(splitArray[12]);
				company.setState(splitArray[14]);
				company.setZip(splitArray[16]);
				company.setFipsCode(splitArray[18]);
				company.setLatitude(splitArray[20]);
				company.setLongitude(splitArray[22]);
			}
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/** Here is how you get a hold of the REST response and Company facts in the working memory
		 * java.util.Collection<org.kie.api.runtime.rule.EntryPoint> collection = (java.util.Collection<org.kie.api.runtime.rule.EntryPoint>)kcontext.getKnowledgeRuntime().getEntryPoints() ;
    for ( org.kie.api.runtime.rule.EntryPoint entryPoint : collection ) {
            entryPointID = entryPoint.getEntryPointId();        
            System.out.println("Entry Point with ID: "+entryPointID);
            for ( Object object : (java.util.Collection<Object>)entryPoint.getObjects() ) {
                    System.out.println( "Here is the Fact object name currently present in your WorkingMemory : " + object.getClass().getName() );
                    if (object.getClass().getName().equalsIgnoreCase("com.sample.Person")) {

                            com.sample.Person personObject = (com.sample.Person)object;
                            System.out.println("The value for 'firstName' field of 'com.sample.Person' Fact is : " + personObject.getFirstName() );
                            System.out.println("The value for 'secondName' field of 'com.sample.Person' Fact is : " + personObject.getSecondName() );
                    }       

            }       
   }
		 */
		
		/**
		 * Parse the REST xml string and place data into Company object
		 * Need to find out if we can update the company object in place or if we need to clear and re-insert.
		 */
		return company;
	}

	private static KieSession readKnowledgeBase() throws Exception {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession();

		return kSession;
	}

}
