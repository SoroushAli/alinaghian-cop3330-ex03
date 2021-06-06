/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;
/*
Example Output

What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints

Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.

Challenge

Modify this program so that instead of prompting for quotes from the user, you create a structure that holds quotes and
their associated attributions and then display all of the quotes using the format in the example. An array of maps would be a good choice.
 */
public class App {
    static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) {

        String quote = readQuote();
        String person = readPerson();
        generateOutput(quote, person);

    }

    private static void generateOutput(String quote, String person) {
        System.out.print("What is the quote? " + quote + "\nWho said it? " + person + "\n" + person + " says, " + '"' + quote + '"');
    }

    private static String readPerson() {
        return in.nextLine();
    }

    private static String readQuote() {
        return in.nextLine();
    }
}