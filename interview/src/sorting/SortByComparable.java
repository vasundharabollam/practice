package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByComparable {

	public static void main(String[] args) {
		 List<Student> studentList = new ArrayList<Student>();
		Student student1=new Student("vasuma",104,"depta");
		studentList.add(student1);
		Student student2=new Student("vasuma",101,"deptb");
		studentList.add(student2);
		Student student3=new Student("vasuma",102,"deptc");
		studentList.add(student3);
		System.out.println("before comparable");
		for (Student student : studentList) {
            System.out.println("Student details: " + student);
        }
		Collections.sort(studentList);
		System.out.println("after comparable by comparable");
		for (Student student : studentList) {
            System.out.println("Student details: " + student);
        }

	}

}
