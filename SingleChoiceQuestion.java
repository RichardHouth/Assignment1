//Richard Houth
//CS 365
//Assignment 1
import java.util.ArrayList;

public class SingleChoiceQuestion implements Questions {

	private String question;
	private ArrayList<String> answer;
	
	public SingleChoiceQuestion(String question, ArrayList<String> answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	public boolean singleQuestion() {
		return true;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public ArrayList<String> getAnswer()
	{
		return this.answer;
	}
}
