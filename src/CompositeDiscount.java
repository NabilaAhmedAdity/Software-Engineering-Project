
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class CompositeDiscount implements IDiscountStrategy{
    
    LinkedList<IDiscountStrategy> disList = new LinkedList<IDiscountStrategy>();
    
    void add(IDiscountStrategy ids)
    {
        disList.add(ids);
    }

    @Override
    public int getTotal(Registration reg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
