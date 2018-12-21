/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstarray;
import java.util.Scanner;
/**
 *
 * @author xcode
 */
public class MyFirstArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for(int i =0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum: " + sum);
    }
    
}
