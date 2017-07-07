//Richard Houth
//CS 356
//Assignment 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;

public class Student {
	
	private int ID;
	private ArrayList<String> answer;
	private static HashMap<Integer, ArrayList<String>> mapAnswer = new HashMap<Integer, ArrayList<String>>();
	
	public Student(int id) {
		this.ID = id;
	}
	
	public int getId() {
		return ID + 1;
	}
	
	public void sendAnswer(Questions question) {
		if (question.singleQuestion()) {
			//For single answers questions. Shuffles the array list and remove 0 index
			answer = new ArrayList<String>(question.getAnswer());
			Collections.shuffle(answer);
			answer.remove(0);
			mapAnswer.put(getId(), answer);
			
		} else {
			//Multiple choice answer. Shuffle array list and remove random index
			answer = new ArrayList<String>(question.getAnswer());
			Collections.shuffle(answer);
			
			int removeRandom;
			removeRandom = (int)(new Random().nextInt(answer.size()) - 1);
			
			for (int i = 0; i < removeRandom; i++) {
				answer.remove(i);
			}
			
			for (int j = 0; j < answer.size(); ++j) {
				if (answer.get(j) != null) {
					mapAnswer.put(getId(), answer);
				}
			}
		}
		Collections.sort(answer);
	}
	
	public ArrayList<String> getAnswer() {
		return answer;
	}
	
	public static HashMap<Integer, ArrayList<String>> fullMap() {
		return mapAnswer;
	}

}
