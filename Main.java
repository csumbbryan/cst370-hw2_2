/*
 * INSTRUCTION:
 *     This is a Java staring code for hw2_2.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.
 * 
 *     Please DO NOT change the name of the main Class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: Describe the main ideas of the program.
 * Name: Write your name
 * Date: MM/DD/YYYY
 */

import java.util.Scanner;

class Main
{
    public static String parseInput(String input) {
        String alphanum = "^[a-zA-Z0-9]*$";
        return input.replaceAll("[^a-zA-Z0-9_-]", "");
    }

    public static void main(String[] args) {

        // Develop your program here.
        // The following is just a sample statement and and you need to replace it with your code

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(parseInput(input));

        System.out.println("Hello world!");
    }
}

