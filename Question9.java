
package labsheet4;

import java.util.Scanner;


public class Question9 {
    public static void main(String[] args) {
    System.out.println("enter a string");
        Scanner sc= new Scanner(System.in);
        Shape2 s;
        String choice=sc.next();
        switch(choice){
            case "circle":
                s=new Circle2();
                s.draw();
                break;
            case "rectangle":
                s=new Rectangle2();
                s.draw();
                break;
            case "square":
                s=new Square2();
                s.draw();
                break;
            default:
                System.out.println("no such choice");
                
        }
}
}