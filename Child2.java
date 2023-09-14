/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet4;

/**
 *
 * @author Aayan
 */
public class Child2 extends Parent2{
     public Child2(int date){
         super(10);
         System.out.println("today's date is "+date);
        System.out.println("this is child constructor");        
    }
    public void display(){
        super.display();
        System.out.println("this is child function");       
    }
}
