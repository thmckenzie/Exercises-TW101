package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    //Instance variables for Isosceles triangles and diamond exercises
    public static int numOfRows;
    public static int currRow;
    String character;


    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    public static void drawAnIsoscelesTriangle(int n) {
        numOfRows = n;
        printTriangle();
    }

    /* To print a line in the triangle, I must first print (NumOfRows-currRow#) spaces and then (2*currRowNum + 1) asterisks.
    Ex. Row 0 and n= 3
       (3-0)Spaces and then (2*0 + 1) asterisks
       */
    public static void printRow(int currRow){
        printRowHelper(" ", (numOfRows-currRow));
        printRowHelper("*", (2*currRow + 1));
        System.out.println();
    }

    //helper method for printing a row of a triangle/diamond
    public static void printRowHelper(String character, int copies){
        for(int i=0; i< copies; i++){
            System.out.print(character);
        }
    }

    //helper method for printing the entire isosceles triangle
    public static void printTriangle(){
        currRow = 0;
        for(int i =0; i<numOfRows; i++){
            printRow(currRow);
            currRow++;
        }
    }




//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        numOfRows = n;
        currRow = 0;

        for(int i = 0; i < numOfRows; i++){
            printRow(currRow);
            currRow++;
        }

        currRow--;
        for(int i = currRow; i > 0; i--){
            printRow(currRow);
            currRow--;
        }
    }


//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        numOfRows = n;
        currRow = 0;

        //Print top of diamond
        for(int i = 0; i < numOfRows; i++){
            printRow(currRow);
            currRow++;
        }

        //Print name in middle of diamond
        System.out.println("TAFARII");

        //Print bottom of diamond
        currRow--;
        for(int i = currRow; i >= 0; i--){
            printRow(currRow);
            currRow--;
        }
    }
}
