package org.epa.mda.poc;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ParseRESTResponse {

	static KieBase kbase;
	static KieSession ksession;

	public static void parseResponse(Company company, String restOutput) {
		try {
			ksession = readKnowledgeBase();
			System.out.println("Response Output from REST call:\n " + restOutput);
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
	}

	private static KieSession readKnowledgeBase() throws Exception {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession();

		return kSession;
	}

}
