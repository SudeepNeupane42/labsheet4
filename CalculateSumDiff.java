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
public class CalculateSumDiff implements Calculator{

    @Override
    public void sum(int a, int b) {
        int sum=a+b;
        System.out.println("sum= "+sum);
    }

    @Override
    public void difference(int a, int b) {
        int diff=a-b;
        System.out.println("difference= "+diff);
    }
}
