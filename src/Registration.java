
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
public class Registration {
 
    private LinkedList<Course> courseList = new LinkedList<Course>();
    public int total, extra, discount;
    private IExtraFeeCalculator iefc;
    private IDiscountStrategy ids;
    
    public Registration(){
        courseList.clear();
        total = 0;
        extra = 0;
        discount = 0;
    }
    
    public void addCourse(Course course){
        courseList.add(course);
        total = total + (course.tutionPerCredit * course.credit);
    }
    
    public LinkedList<Course> getRegistration(){
        return courseList;
    }
    
    public int getTotal(){
        return total;
    }
    
    public int getExtraFeeAmount(){
        iefc = (CourseFactory.getInstance()).getExtraFeeCalculator();  //instance of extra fee calculator
        extra = iefc.getExtraAmount(total);
        return extra;
    }
    
    public void discountStrategy(IDiscountStrategy ids)
    {
        this.ids = ids;
        discount = ids.getTotal(this);
    }
    
    public int getDiscount()
    {
        return discount;
    }
    public int getGrandTotal(){
        
         return total+extra-discount;
    }
    
    public LinkedList<PropertyListener> listener = new LinkedList<PropertyListener>();
    
    public void addLis(PropertyListener pl)
    {
        listener.add(pl);
    }
        
   public void publishEvent()
   {
       for(int i=0; i<listener.size(); i++)
       {
           PropertyListener lis = listener.get(i);
           lis.publish();
       }
   }
}
