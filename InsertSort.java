import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
* In today's daily assignment,
* The program uses insert sort.
*
* @author  Navin Balekomebole
* @version 1.0
* @since   2023-05-16
*/

public final class InsertSort {

    /**
    * For the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private InsertSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main method here in
    * this section of the code.
    *
    * @param args Unused
    */
    public static void main(String[] args) {

        // In th section of the program,
        // it will Create a list
        // keep the input arrays in place.
        final ArrayList<int[]> inputList = new ArrayList<>();

        try {
            // Create the input file.
            // Create the output file.
            // Create the scanner.
            final File input = new File("input.txt");
            final Scanner scanInput = new Scanner(input);
            final FileWriter output = new FileWriter("output.txt");

            while (scanInput.hasNextLine()) {
                // While loop used here.
                final String line = scanInput.nextLine().trim();

                // If statement used in
                // This section of the code.
                if (!line.isEmpty()) {
                    // Parse the input line
                    final String[] numStrings = line.split(" ");
                    int[] arrOfInt = new int[numStrings.length];
                    for (int i = 0; i < numStrings.length; i++) {
                        try {
                            arrOfInt[i] = Integer.parseInt(numStrings[i]);
                        } catch (NumberFormatException err) {
                            // If it's not an integer,
                            System.out.println("An error occurred.");
                            arrOfInt = null;
                        }
                    }

                    // Another if statement.
                    // Used in this section of the code.

                    if (arrOfInt != null) {
                        inputList.add(arrOfInt);
                    } else {
                        output.write("Invalid input\n");
                    }
                }
            }

            // In this part of the program,
            // it will use insertion sort.
            // Insertion is used to sort.
            // Unsorted arrays.
            for (int[] arrOfInt : inputList) {
                insertionSort(arrOfInt);
                output.write(Arrays.toString(arrOfInt) + "\n");
                System.out.println(Arrays.toString(arrOfInt));
            }

            // Close the output.
            // That's what this part of the code
            // Will do.
            output.close();

        } catch (IOException err) {
            // Display the error
            System.err.println("Error: " + err.getMessage());
        }
    }

    /**
    * Insert sort is used in this method.
    *
    * @param array *
    */
    private static void insertionSort(int[] array) {
        final int n = array.length;
        for (int i = 1; i < n; i++) {
            final int currentNum = array[i];
            int index = i - 1;
            while (j >= 0 && array[j] > currentNum) {
                array[j + 1] = array[j];
                index--;
            }
            array[j + 1] = currentNum;
        }
    }
}
