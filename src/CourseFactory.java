
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class CourseFactory {
    
    private Course course;
    public static CourseFactory instance = null;
    public static IExtraFeeCalculator iefc = null;
    private IExtraFeeCalculator  taxType1;
    private IExtraFeeCalculator  taxType2;
    private PersistenceFacade pf;
    
    public CourseFactory(){
       
        
        taxType1 = new DevelopmentFeeCalculator();
        taxType2 = new BDTaxAdapter();
        
    }
    

    public static synchronized CourseFactory getInstance(){
        if(instance == null)
            instance = new CourseFactory();
        return instance;
    }
    
    public Course getCourse(int oid){
         Object obj = pf.get(oid, Course.class);
         course = (Course)obj;
         return course;
     }
     
    
    public IExtraFeeCalculator getExtraFeeCalculator(){
        if(iefc == null)
        {
            java.io.File file = new java.io.File("input.txt");
            try{
                Scanner input = new Scanner(file);
                String type = input.nextLine();
                if("DevelopmentFeeCalculator".equals(type))
                    iefc = (DevelopmentFeeCalculator)taxType1;
                else if("BDTaxCalculator".equals(type))
                    iefc = (BDTaxAdapter)taxType2;
            }
            catch (FileNotFoundException e){
                System.err.format("File does not exits\n");
            }
        }
        
        return iefc;
    }
    
}
