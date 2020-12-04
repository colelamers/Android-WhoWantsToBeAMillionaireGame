package whowantstobemillionaire;

public class Round {
	
	String question;
	String[] arrList = new String[4];
	int answer;

	public Round(String question, String[] ansListArray, int answer) {
		this.question = question;
		this.arrList = ansListArray;
		this.answer = answer;
	}
	
	public String getQuestion()
	{
		return this.question;
	}
	
	public String[] getArrList()
	{
		return this.arrList;
	}
	
	public int getAnswer()
	{
		return this.answer;
	}
}
