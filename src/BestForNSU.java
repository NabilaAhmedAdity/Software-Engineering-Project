/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class BestForNSU extends CompositeDiscount{
    
    BestForNSU()
    {
        this.add(new FreedomFighterDiscount());
        this.add(new AcademicExcellentDiscount());
    }
    public int getTotal(Registration reg)
    {
        IDiscountStrategy ids;
        int discount = 1000000009;
        
        for(int i=0; i<this.disList.size(); i++){
            ids = this.disList.get(i);
            if(discount > ids.getTotal(reg))
                discount = ids.getTotal(reg);
        }
        
        return discount;
    }
    
}
