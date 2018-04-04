package property;

import user.Tenant;

public abstract class Property {

   private Deed deed; //Escritura
   private Services services; //Luz, gas, te
   private Taxes taxes;
   private String type;
   private String legalAddress;
   private Blueprint blueprint;
   private FunctionalUnit functionalUnit;

}
