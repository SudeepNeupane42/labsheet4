/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;


public abstract class  Fruit {
    private String name;
    public abstract void displayTaste();
    public abstract void displayName();
    
    public void sayFruit(){
        System.out.println("i am fruit");
    }
}
