/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class ManufacturerProxy implements IManufacturer{

    private int oid;
    private Manufacturer real = null;
    
    public ManufacturerProxy(int oid){
     
       this.oid = oid;
    }
    @Override
    public String getDetails() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(real == null)
       {
           real = new Manufacturer(oid);
       }
       return real.getDetails();
    }
    
}
