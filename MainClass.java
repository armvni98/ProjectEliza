package ProjectEliza;		//ASHADUR OMITH   //CMP 167   

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		//creates PromptBank object to use and have access to the sentences from our prompt bank on the other tab

		PromptBank bank = new PromptBank();

		//scanner object created to read the input from the program

		Scanner scnr = new Scanner(System.in);

		//prints the first statement when you run the program 

		System.out.println("Hello, my name is Eliza. What is your name?");

		//stores user input to the variable called name

		String name = scnr.nextLine();

		System.out.println("Hello " + name + ". Tell me what is on your mind today in 1 sentence.");


		
		
		//goes through the loop for as long as the user enters an input

		while (scnr.hasNextLine()) {

			//stores the statement provided by the user

			String line = scnr.nextLine();

			if (line.equalsIgnoreCase("exit")) {

				System.out.println("Do you want to run the session again?");

				String input = scnr.nextLine();

				if (input.equalsIgnoreCase("No")) {

					System.out.println("Goodbye, until next time.");

					System.exit(0);

				}else if(input.equalsIgnoreCase("Yes")){

					System.out.println("Hello, my name is Eliza. What is your name?");

					//stores name

					name = scnr.nextLine();

					System.out.println("Hello " + name + ". Tell me what is on your mind today in 1 sentence.");

				}

			} else if (line.charAt(line.length() - 1) == '?') {//If the statement ends with ? question is displayed

				String sentence = bank.getRandomQuestionTrunk(); //object bank is created so this statement calls the method within it

				String output = getOutputSentence(line.replace('?', ' '), sentence);

				System.out.println(output);

			} else if (line.charAt(line.length() - 1) == '!') {//If the line ends with ! "WOW! Dramatic! " is added to output sentence

				String sentence = bank.getRandomStatementTrunk(); //object bank is created so this statement calls the method within it

				String output = getOutputSentence(line.replace('!', ' '), sentence); //replaces the ! with space and outputs the dramatic line

				System.out.println("WOW! Dramatic! " + output);

			} else {

				String statement = bank.getRandomStatementTrunk();

				System.out.println(getOutputSentence(line.replace('.', ' '), statement)); //replaces any period at the end with space so
																							//last word can be chosen

			}

		}
	}

	/*
	 * Method returns the statement after replacing BLANK1 and BLANK2 with first
	 * and last word of the sentence
	 */

	public static String getOutputSentence(String line, String sentence) { 

		String[] words = line.split(" "); //creates the array of words separating each by a space

		String word1 = words[0]; //first word assigned to word1

		String word2 = words[words.length - 1]; //word2 is the last word 

		String outputLine = sentence.replace("BLANK1", word1); //outputLine holds the sentence (statement) replacing blank1 with word1

		return outputLine.replace("BLANK2", word2);

	}

}