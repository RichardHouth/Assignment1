//Richard Houth
//CS 356
//Assignment 1
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args)
	{	
		
		//Single Choice Question
		String singleQuestion = "Do you drive to school?";
		ArrayList<String> singleAnswer = new ArrayList<String>();
		singleAnswer.add("Yup");
		singleAnswer.add("Nope");
		Questions single = new SingleChoiceQuestion(singleQuestion, singleAnswer);
		
		
		//Multiple Choice Question
		String multipleQuestion = "Vote on which car manufacturer you prefer:";
		ArrayList<String> multipleAnswer = new ArrayList<String>();
		multipleAnswer.add("Toyota");
		multipleAnswer.add("Honda");
		multipleAnswer.add("Ford");
		multipleAnswer.add("Dodge");
		multipleAnswer.add("Nissan");
		Questions multiple = new MultipleChoiceQuestion(multipleQuestion, multipleAnswer);
		
		
		//Ask user to pick single or multiple choice questions 
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.println("Enter 0 for single choice question and 1 for multiple choice questions: ");
		int user = k.nextInt();
		
		Questions questionType[] = new Questions[2];
		Questions questionChoice;
		questionType[0] = single; 
		questionType[1] = multiple;
		questionChoice = questionType[user];		
		
		System.out.println("Enter a number of student to vote: ");
		int studentSize = k.nextInt();
		Student student[] = new Student[studentSize];
		
		for (int i = 0; i < studentSize; i++)
		{
			student[i] = new Student(i);
		}
		
		System.out.println("\nQuestion: " + questionChoice.getQuestion());
		
		
		//Each student displays at least one result
		System.out.println("\nResults: ");

		for (int i = 0; i < studentSize; i++)
		{
			student[i].sendAnswer(questionChoice);
			System.out.println("Student " + student[i].getId() + " answered: " + student[i].getAnswer());
		}
		
		//Randomly chooses the students that submit multiple answers
		//Total number of answers is double the number of students in the ivote
		
		int randomID;
		
		for (int i = 0; i < studentSize; i++)
		{
			randomID = (int)(new Random().nextInt(studentSize));
			student[randomID].sendAnswer(questionChoice);
			System.out.println("Student " + student[randomID].getId() + " answered: " + student[randomID].getAnswer());
		}
		
		
		//Initialize iVote system
		IVoteService iVote = new IVoteService();

		System.out.println("\nTotal results:");
		iVote.displayTotals();
		
	}
}
