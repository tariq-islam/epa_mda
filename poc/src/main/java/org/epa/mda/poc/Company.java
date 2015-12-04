package org.epa.mda.poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Company implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Address")
   private java.lang.String address;
   @org.kie.api.definition.type.Label("Program Type")
   private org.epa.mda.poc.ProgramType programType;

   @org.kie.api.definition.type.Label(value = "Part 79")
   private java.lang.Boolean part79;

   @org.kie.api.definition.type.Label(value = "Part 80")
   private java.lang.Boolean part80;

   public Company()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public org.epa.mda.poc.ProgramType getProgramType()
   {
      return this.programType;
   }

   public void setProgramType(org.epa.mda.poc.ProgramType programType)
   {
      this.programType = programType;
   }

   public java.lang.Boolean getPart79()
   {
      return this.part79;
   }

   public void setPart79(java.lang.Boolean part79)
   {
      this.part79 = part79;
   }

   public java.lang.Boolean getPart80()
   {
      return this.part80;
   }

   public void setPart80(java.lang.Boolean part80)
   {
      this.part80 = part80;
   }

   public Company(java.lang.String name, java.lang.String address,
         org.epa.mda.poc.ProgramType programType, java.lang.Boolean part79,
         java.lang.Boolean part80)
   {
      this.name = name;
      this.address = address;
      this.programType = programType;
      this.part79 = part79;
      this.part80 = part80;
   }

}