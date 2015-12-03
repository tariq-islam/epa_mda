package org.epa.mda.poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Elements")
   private java.util.List<org.epa.mda.poc.Element> elements;
   @org.kie.api.definition.type.Label(value = "Element")
   private java.lang.String element;
   @org.kie.api.definition.type.Label(value = "Percent Makeup")
   private java.lang.Integer percentMakeup;

   public Product()
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

   public java.util.List<org.epa.mda.poc.Element> getElements()
   {
      return this.elements;
   }

   public void setElements(java.util.List<org.epa.mda.poc.Element> elements)
   {
      this.elements = elements;
   }

   public java.lang.String getElement()
   {
      return this.element;
   }

   public void setElement(java.lang.String element)
   {
      this.element = element;
   }

   public java.lang.Integer getPercentMakeup()
   {
      return this.percentMakeup;
   }

   public void setPercentMakeup(java.lang.Integer percentMakeup)
   {
      this.percentMakeup = percentMakeup;
   }

   public Product(java.lang.String name,
         java.util.List<org.epa.mda.poc.Element> elements,
         java.lang.String element, java.lang.Integer percentMakeup)
   {
      this.name = name;
      this.elements = elements;
      this.element = element;
      this.percentMakeup = percentMakeup;
   }

}