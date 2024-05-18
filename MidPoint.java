/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midpoint;

import java.util.Scanner;

/**
 *
 * @author Milad
 */
public class MidPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int n = scanner.nextInt();

        double[] xCoordinates = new double[n];
        double[] yCoordinates = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x :" + (i + 1) + "Enter ");
            xCoordinates[i] = scanner.nextDouble();
            System.out.print("y :" + (i + 1) + "Enter ");
            yCoordinates[i] = scanner.nextDouble();
        }

        double sumX = 0;
        double sumY = 0;

        for (int i = 0; i < n; i++) {
            sumX += xCoordinates[i];
            sumY += yCoordinates[i];
        }

        double midpointX = sumX / n;
        double midpointY = sumY / n;
        
        System.out.println("Mid Point: (" + midpointX + ", " + midpointY + ")");
        
        for (int i = 0; i < n; i++) {
            double distance = Math.sqrt(Math.pow((xCoordinates[i] - midpointX), 2) + Math.pow((yCoordinates[i] - midpointY), 2));
            System.out.println("distance between point " + (i + 1) + " and middle point :" + distance);
        }

    }

}
