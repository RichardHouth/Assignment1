//Richard Houth
//CS 365
//Assignment 1
import java.util.ArrayList;

public class MultipleChoiceQuestion implements Questions {

	private String question;
	private ArrayList<String> answer;
	
	public MultipleChoiceQuestion(String question, ArrayList<String> answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	public boolean singleQuestion() {
		return false;
	}
	
	public String getQuestion() {
		return this.question;
	}

	public ArrayList<String> getAnswer() {
		return this.answer;
	}	
}
