///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:               Optimized PickUpTime
// Course:          23Fall Cs200
//
// Author:          Chenming Ye
// Email:           cye52@wisc.edu
// Lecturer's Name:  Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// no sources referred.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
import java.util.Scanner;
/**
 * The class contains one method to determine Max, Min, and Avg of an Int list
 * <p>Bugs: No bugs
 *
 * @author Chenming Ye
 */
public class MinMaxAvg {

    /**
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALUES = 10;
        int[] userValues = new int[NUM_VALUES];
        int i;



        for (i = 0; i < userValues.length; ++i) {
            userValues[i] = scnr.nextInt();
        }

        int Min = userValues[0];
        int Max = userValues[0];
        float Sum = userValues[0];
        for (i = 1; i < userValues.length; ++i)
        {
            if (userValues[i] > Max) {
                Max = userValues[i];
            }
            if (userValues[i] < Min)
            {
                Min = userValues[i];
            }
            Sum += userValues[i];
        }

        float average = (Sum-Min-Max) / 8;

        System.out.println(Min + " " + Max + " " + average);
   }
}
