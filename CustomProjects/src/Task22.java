/*
  HF5735 Web Development: Dynamically Generated Content
  Author: Kamil Milej | Date: 30.05.2025
  Version: 1.0
*/

import java.util.HashMap;   // Import HashMap so we can store letter → count pairs
import java.util.Scanner;   // Import Scanner to read user input from the console

public class Task22 {       // Define a public class named Task22

    /* METHODS */           // Section marker (as per your convention)

    public void task22() {  // Define a public method with no return value (entry point for this task)
        Scanner scanner = new Scanner(System.in);                 // Create a Scanner to read from standard input (System.in)
        System.out.println("write any sentence you want");        // Prompt the user to type any sentence
        String sentence = scanner.nextLine().toLowerCase();       // Read the whole line, then convert it to lowercase to count letters case-insensitively

        HashMap<Character, Integer> letters = new HashMap<>();    // Create a HashMap to hold counts: key = letter, value = how many times it appears

        for (char c : sentence.toCharArray()) {                   // Loop over every character in the input sentence
            if (Character.isLetter(c)) {                          // Process only letters (skip spaces, digits, punctuation, etc.)
                // If the letter is already in the map, increment its count; otherwise start from 0 and then add 1
                letters.put(c, letters.getOrDefault(c, 0) + 1);   // getOrDefault avoids NullPointer by providing 0 when key is missing
            }
        }

        System.out.println("\nLiczba wystąpień każdej litery:");  // Print a header (Polish: "Number of occurrences of each letter:")
        for (char key : letters.keySet()) {                       // Iterate over all unique letters collected in the map
            System.out.println(key + " → " + letters.get(key));   // Print the letter and its count (order is not guaranteed in a HashMap)
        }

        scanner.close();                                          // Close the Scanner to free the underlying input resource (System.in)
    }                                                             // End of method task22
}                                                                 // End of class Task22
