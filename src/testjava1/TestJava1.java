/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava1;
import java.util.Scanner;

/**
 *
 * @author Orgil
 */
public class TestJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name =");
        String yourName = input.nextLine();
        System.out.printf("Hello, faithfull servant %s\n", yourName);
    }
    
}
