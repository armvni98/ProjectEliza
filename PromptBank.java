package ProjectEliza;		//ASHADUR OMITH   //CMP 167   

import java.util.Random;

public class PromptBank {

	String[] questions;

	String[] statements;

	Random r = new Random();

	public PromptBank() {

		questions = new String[3]; //initialize your array to the correct
		// length to match your number of questions you populate it with

		statements = new String[3];//initialize your array to the correct length to match
		// your number of questions you populate it with
		
		populateStatementsArray();

		populateQuestionsArray();

	}

	public void populateStatementsArray() {

		statements[0] = "Tell me more about BLANK1 and BLANK2";

		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";

		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";

		/*

		 * complete this method with your other statements using BLANK1 for

		 * word1 and BLANK2 for word2 place holder

		 */

	}

	public void populateQuestionsArray() {

		questions[0] = "Is there anything else about BLANK1 and BLANK2?";

		questions[1] = "Does BLANK1 bother you? How about BLANK2?";

		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";

		/*

		 * complete this method with your other questions using BLANK1 for word1

		 * and BLANK2 for word2 place holder

		 */

	}

	/*

	 * fill in the method so it randomly selects the statement template //from

	 * the questions array ... hint use Math.random() to get the random index

	 * //so you can replace BLANK1 and BLANK2 with the appropriate words

	 */

	public String getRandomStatementTrunk() {

		int i = r.nextInt(3); //assigning i to a random number up to the number 3

		String statement = statements[i]; //the random number stored in "i" will be the element within the statement assigning it the String statement

		return statement;

	}

	/*

	 * //fill in the method so it randomly selects the question template //from

	 * the questions array ... hint use Math.random() to get the random index

	 * //so you can replace BLANK1 and BLANK2 with the appropriate words

	 *

	 */

	public String getRandomQuestionTrunk() {

		int i = r.nextInt(3); //assigning i to a random number up to the number 3

		String question = questions[i];  //the random number stored in "i" will be the element within the questions assigning it the String question

		return question;

	}

}