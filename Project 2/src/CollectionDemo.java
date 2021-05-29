import java.util.ArrayList;
import java.util.List;

class Stud implements Comparable<Stud> {
	int rollno, marks;
	String name;

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Stud s) {
		return rollno > s.rollno ? 1 : -1;
	}
}

public class CollectionDemo {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();

		studs.add(new Stud(23, "Mani", 55));
		studs.add(new Stud(24, "Ananya", 56));
		studs.add(new Stud(25, "Tanu", 57));
		studs.add(new Stud(26, "Sonu", 58));

		for (Stud s : studs) {
			System.out.println(s);
		}
	}

}
