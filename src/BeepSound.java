
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class BeepSound implements PropertyListener{
    
    //RegistrationCourseController rcc; 
    
    public BeepSound(RegistrationCourseController rcc)
    {
        rcc.addListener(this);
    }

    @Override
    public void publish() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
        
        //AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/Nabila Semester/11th semester/SE/Code/Assignment1/beep.mp3").getAbsoluteFile());
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("beep.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }
    
}
