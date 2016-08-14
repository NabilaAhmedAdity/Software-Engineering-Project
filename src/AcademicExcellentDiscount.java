/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class AcademicExcellentDiscount implements IDiscountStrategy{
    
    @Override
    public int getTotal(Registration reg)
    {
        return (int)((double)(reg.total)/2.0);
    }
    
}
