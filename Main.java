package whowantstobemillionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args)
	{
		WWTBAM_Object wo = new WWTBAM_Object();
		List<Round> roundsList = new ArrayList<Round>();
		Random rand = new Random();

		for(int i = 0; i < 50; i++)
		{
			roundsList.add(new Round(wo.getQuestion(i),wo.getAnswersArray(i),wo.getIndexOfCorrectAnswer(i)));
		}//this builds the rounds object
		
		int rng = rand.nextInt(50);//this returns a random number between 0-50
		
		String s = 	Arrays.toString(roundsList.get(rng).getArrList());//this shortens up the code
		
		System.out.println(roundsList.get(rng).getQuestion());//this will get the question
		System.out.println(s);//this will return the array entirely as a string
		System.out.println(roundsList.get(rng).getArrList()[roundsList.get(rng).getAnswer()]);//this will get the answer

		System.out.println(rng);

	}
}
