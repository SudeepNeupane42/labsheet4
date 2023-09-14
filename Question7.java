
package labsheet4;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        Shape s= new Shape();
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                s=new circle();
                s.draw();
                break;
            case 2:
                s=new Rectangle();
                s.draw();
                break;
            case 3:
                s=new Square();
                s.draw();
                break;
            default:
                s.draw();
               
        }
    }
}
