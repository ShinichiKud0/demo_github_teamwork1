/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class DemoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter b: ");
        b = sc.nextInt();
        System.out.println("Sum " + a + " + " + b + " = " + (a + b));
    }

}
