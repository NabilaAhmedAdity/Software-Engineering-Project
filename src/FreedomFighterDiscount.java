/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class FreedomFighterDiscount implements IDiscountStrategy{
    
    @Override
    public int getTotal(Registration reg)
    {
        int ans = reg.total-20000;
        if(ans<0)
            ans = 0;
        return ans;
    } 
    
}
