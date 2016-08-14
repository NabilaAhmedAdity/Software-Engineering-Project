
import static java.lang.Math.ceil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class DevelopmentFeeCalculator extends IExtraFeeCalculator{
    
    @Override
    public int getExtraAmount(int total){
        
        double value = ceil(total*0.1);
        return (int)value;
    }
    
}
