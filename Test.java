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
public class Test extends Student{
    private int java;
    private int english;
    
    
    public void setMarks(int j,int e){
        this.java=j;
        this.english=e;
    }

    public int getJava() {
        return java;
    }

    public int getEnglish() {
        return english;
    }
    
}
