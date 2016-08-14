/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class Course {
    
    public int credit, tutionPerCredit, subTotal;
    public String title, id;
    
    public Course(){
        
    }
    
    public Course(String id, String title, int credit, int tutionPerCredit){
        
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.tutionPerCredit = tutionPerCredit;
        this.subTotal = credit*tutionPerCredit;
    }
}
