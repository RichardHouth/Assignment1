//Richard Houth
//CS 356
//Assignment 1
import java.util.Arrays;
import java.util.ArrayList;

public class IVoteService {

	@SuppressWarnings("unchecked")
	public void displayTotals() {

		System.out.println(Arrays.asList(Student.fullMap()));

		int yup = 0;
		int nope = 0;
		int toyota = 0;
		int honda = 0;
		int ford = 0;
		int dodge = 0;
		int nissan = 0;

		ArrayList<String> yes = new ArrayList<String>();
		yes.add("Yup");

		ArrayList<String> no = new ArrayList<String>();
		no.add("Nope");

		ArrayList<String> t1 = new ArrayList<String>();
		t1.add("Toyota");

		ArrayList<String> h1 = new ArrayList<String>();
		h1.add("Honda");

		ArrayList<String> f1 = new ArrayList<String>();
		f1.add("Ford");

		ArrayList<String> d1 = new ArrayList<String>();
		d1.add("Dodge");

		ArrayList<String> n1 = new ArrayList<String>();
		n1.add("Nissan");

		for (int i = 1; i <= Student.fullMap().size(); i++) {
			if (Student.fullMap().get(i).equals(yes)) {
				yup++;

			} else if (Student.fullMap().get(i).equals(no)) {
				nope++;
			} else if (Student.fullMap().get(i).equals(t1)) {
				toyota++;
			} else if (Student.fullMap().get(i).equals(h1)) {
				honda++;
			} else if (Student.fullMap().get(i).equals(f1)) {
				ford++;
			} else if (Student.fullMap().get(i).equals(d1)) {
				dodge++;
			} else if (Student.fullMap().get(i).equals(n1)) {
				nissan++;
			}
		}

		System.out.println("Yup: " + yup);
		System.out.println("Nope: " + nope);
		System.out.println("Toyota: " + toyota);
		System.out.println("Honda: " + honda);
		System.out.println("Ford: " + ford);
		System.out.println("Dodge: " + dodge);
		System.out.println("Nissan: " + nissan);
	}

}
