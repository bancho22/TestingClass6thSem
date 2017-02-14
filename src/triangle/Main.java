/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bancho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a comma separated list of the three sides of a triangle, type 'exit' to close:");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            String[] sidesStr = input.split(",");
            if(sidesStr.length != 3){
                System.out.println("Error: Invalid number of sides, needs to be 3");
                continue;
            }
            int sideA = Integer.parseInt(sidesStr[0]);
            int sideB = Integer.parseInt(sidesStr[1]);
            int sideC = Integer.parseInt(sidesStr[2]);
            Triangle t;
            try {
                t = new Triangle(sideA, sideB, sideC);
            } catch (InvalidTriangleException ex) {
                System.out.println("Error: " + ex.getMessage());
                continue;
            }
            System.out.println(t.getTriangleType());
        }
    }
    
}
