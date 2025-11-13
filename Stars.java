/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars;

/**
 *
 * @author llujan2027
 */
public class Stars {

    public static void main(String[] args) {
        //example
        final int MAX_ROWS = 10;
        System.out.println("EX.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //print out the appropriate number of stars for that row
            for (int star = 1; star <= row; star++){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        //shape a.
        System.out.println("\na.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //print out the appropriate number of stars for that row
            for (int star = 10; star >= row; star--){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        //shape b.
        System.out.println("\nb.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //print out the appropriate number of spaces for that row
            for (int space = 9; space >= row; space--){
                System.out.print(" ");
            }
            //print out the appropriate number of stars for that row
            for (int star = 1; star <= row; star++){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        //shape c.
        System.out.println("\nc.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //print out the appropriate number of spaces for that row
            for (int space = 0; space <= row-2; space++){
                System.out.print(" ");
            }
            //print out the appropriate number of stars for that row
            for (int star = 10; star >= row; star--){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        //shape d.
        System.out.println("\nd.");
        //for the first half of rows
        for (int row = 1; row <= (MAX_ROWS/2); row++){
            //print out the appropriate number of spaces for that row
            for (int space = 4; space >= row; space--){
                System.out.print(" ");
            }
            //print out the appropriate number of stars for that row
            //only prints out up to the middle
            for (int star = 1; star <= row; star++){
            System.out.print("*");
            }
            //prints out right side of stars
            for (int star = 1; star <= row-1; star++){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        //for the last half of rows
        for (int row = 1; row <= (MAX_ROWS/2); row++){
            //print out the appropriate number of spaces for that row
            for (int space = 0; space <= row-2; space++){
                System.out.print(" ");
            }
            //print out the appropriate number of stars for that row
            //only prints out up to the middle
            for (int star = 5; star >= row; star--){
            System.out.print("*");
            }
            //prints out right side of stars
            for (int star = 5; star >= row+1; star--){
            System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
    }
}
