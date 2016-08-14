/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class RegistrationCourseController {
    
    private String id;
    private Course course ;
    private CourseFactory cf;
    private Registration reg;
    private int total;
    private PersistenceFacade pf;
    
    public RegistrationCourseController(){
        cf = CourseFactory.getInstance();
        reg = new Registration();
        pf.getInstance();
    }
    
    public void addCourse(int oid){
       course = cf.getCourse(oid);
       reg.addCourse(course);
    }
    public Course getCourse(){
        return course;
    }
    public int getTotal(){
        total = reg.getTotal();
        return total;
    }
    
    public int getExtraFeeAmount(){
        return reg.getExtraFeeAmount();
    }
    
    public void calculateDiscount(String itemText)
    {
        if(itemText  == "Academic Excellence")
        {
            reg.discountStrategy(new AcademicExcellentDiscount());
        }
        else if(itemText == "Freedom Fighter")
        {
            reg.discountStrategy(new FreedomFighterDiscount());
        }
        else if(itemText == "Best For NSU")
        {
            reg.discountStrategy(new BestForNSU());
        }
        else if(itemText == "Best For Student")
        {
           reg.discountStrategy(new BestForStudent());
        }
    }
    
    public int getDiscount()
    {
        return reg.getDiscount();
    }
    public int getGrandTotal(){
        return reg.getGrandTotal();
    }
    
    public void addListener(PropertyListener pl)
    {
        reg.addLis(pl);
    }

    public void publishEvent()
    {
        reg.publishEvent();
    }
}
