package org.epa.mda.poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProgramType implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Type")
   private java.lang.String type;
   @org.kie.api.definition.type.Label(value = "Business Activities")
   private java.util.List<java.lang.String> businessActivities;
   @org.kie.api.definition.type.Label(value = "Business Activity")
   private java.lang.String businessActivity;

   public ProgramType()
   {
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.util.List<java.lang.String> getBusinessActivities()
   {
      return this.businessActivities;
   }

   public void setBusinessActivities(
         java.util.List<java.lang.String> businessActivities)
   {
      this.businessActivities = businessActivities;
   }

   public java.lang.String getBusinessActivity()
   {
      return this.businessActivity;
   }

   public void setBusinessActivity(java.lang.String businessActivity)
   {
      this.businessActivity = businessActivity;
   }

   public ProgramType(java.lang.String type,
         java.util.List<java.lang.String> businessActivities,
         java.lang.String businessActivity)
   {
      this.type = type;
      this.businessActivities = businessActivities;
      this.businessActivity = businessActivity;
   }

}