import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /** DIRECTIONS:
         * For a given 5x5 matrix of all 0s for the exception of one 1, find the minimum
         * number of moves to get the 1 to the center of the matrix.
         *
         * For example,
         * 0 0 0 0 0
         * 0 0 0 0 1
         * 0 0 0 0 0
         * 0 0 0 0 0
         * 0 0 0 0 0
         * equates to 3 moves (2 to the left, and 1 down).
         */

        // The amount of moves can be computed by the sum of how far away the 1 is both horizontally and vertically to the center.

        // By locating the x and y position of the 1, the moves can be calculated by the following expression:
        // |2 - x| + |2 - y| (note x and y are zero indexed)

        Scanner s = new Scanner(System.in);

        // While searching for y, keep track of the row with the 1.
        // This will later be used to find the x value.
        String rowWith1 = "";

        // Find y value.
        int y = -1;
        boolean found;
        do{
            rowWith1 = s.nextLine();
            found = rowWith1.contains("1");
            y++;
        } while(!found);

        // Find x value (divide by 2 since there are spaces in the string still).
        int x = rowWith1.indexOf('1') / 2;

        int moves = Math.abs(2 - x) + Math.abs(2 - y);
        System.out.println(moves);


    }

}