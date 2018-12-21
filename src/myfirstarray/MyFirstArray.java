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
        String n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word: ");
        n = s.next();
        char[] a = n.toCharArray();
        
        //for(int i = 0; i < n; i++)
        //{
        //    a[i] = s.n
        //}
        for(int i = n.length()-1; i >= 0; i--)
        {
            System.out.println("Letter: " +a[i]);
        }
    }
    
}
