/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] rollResults = new int[n];
        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(6);
            if (rand != 0) break;
        }
        return rollResults;
    }

    public static boolean containsDuplicates(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return true;

                }
            }
        }
        return false;
    }

    public static int calculatingAverages(int[] inputArray) {
        int sum = 0;
        int average;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
          average = sum / inputArray.length;
        return average;
    }


}

//got some help from GeeksForGeeks on using nextINT and break also got help from demo

