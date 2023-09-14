/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;

import java.util.Scanner;

/**
 *
 * @author student3
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        CalculateSumDiff s=new CalculateSumDiff();
        s.sum(num1, num2);
        s.difference(num1,num2);
    }
}
