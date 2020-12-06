/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkq3;

import java.util.Scanner;

/**
 *
 * @author die_g
 */
public class HomeworkQ3 {

    /**
     * @param args the command line arguments 
     * Create a program that will ask the
     * user to enter the marks they have received for an assignment that is
     * worth 20% of the marks for the module. The maximum mark is 100 and the
     * minimum is 0 (zero). Output an error message if they enter any other
     * number OR if they do not enter a number at all. If they enter a valid
     * number, output the PERCENTAGE equivalent.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //First we ask the student (Sout+ctrl+space) to enter their mark.
        System.out.println(" Please enter your Assignment mark ");
        String myMark;
        
        
// create a String to the value given for the user, said value has to be a number.
        int inputNumb;
        myMark = myScanner.nextLine();
        try {
            inputNumb = Integer.parseInt(myMark);
//in case of the user added a value which isn't a number, use a casting to change the String to Integer then by try and cath add a messege telling the user to use only numbers 

            askMarks(inputNumb);

        } catch (NumberFormatException e) {
            System.err.print("Please enter a Integer number " + e);
            
        }

        //in case the user enters a valid character, the program continue running...
    }

    /**
     * create a method called asMark to do all the operations need it to then called as a argument 
     *
     * @param m1
     */
    public static void askMarks(int m1) {
//create the primitive variables which has to be between the values of 0 and 100
        final int maxMark = 100;
        final int minMark = 0;
        float percentage = 0f;
//m1 is the name given to the value entered by the user, this wasn't modifieded at all becuase whe just add it a float variable in order to show the percentage of the mark in decimals
//use if and else statement to continue with the program 
        if (m1 >= minMark && m1 <= maxMark) {
            percentage = ((float) m1 / 100) * 20;
            System.out.println("Your score is " + percentage + "%");
          //adding and aditional if and else to show the percentage out of 20 the user got
            if (percentage < 20) {
                System.out.println("Your score is " + percentage + "% Out of a maximun of 20% ");
            } else {
                System.out.println("Congratulations you got the Highest Mark");
            }

        } else {
            System.err.print("Please Enter a number between 0 and 100 ");

        }
    }

}
