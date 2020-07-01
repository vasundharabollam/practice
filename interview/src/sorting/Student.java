package sorting;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private String deparement;

	public Student(String name, int id, String deparement) {
		super();
		this.name = name;
		this.id = id;
		this.deparement = deparement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeparement() {
		return deparement;
	}

	public void setDeparement(String deparement) {
		this.deparement = deparement;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", deparement=" + deparement + "]";
	}

	public int compareTo(Student o) {
		return this.id - o.id;
	}
}
