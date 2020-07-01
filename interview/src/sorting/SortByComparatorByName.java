package sorting;

import java.util.Comparator;

public class SortByComparatorByName implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }

}
