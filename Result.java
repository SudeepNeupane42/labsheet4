/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;

/**
 *
 * @author student3
 */
public class Result extends Test{
        
    
    public int totalMarks;
    public double percentage;
    
    public void CalculatePercent(){
        totalMarks=getJava()+getEnglish();
        percentage=totalMarks*100/200;
    }
    public double getPercent(){
        return percentage;
    }
}
