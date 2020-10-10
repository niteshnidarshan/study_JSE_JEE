package core.java.stream.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {

	public static List<Student> getStudents(){
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Ram G", 1, 2.9, "Male", Arrays.asList("Photography","Swimming", "Archiery", "All")));
		list.add(new Student("Laxman G", 2, 3.9, "Male", Arrays.asList("Photography","Swimming", "Archiery", "All")));
		list.add(new Student("Bharat G", 3, 4.9, "Male", Arrays.asList("Photography","Swimming", "Archiery", "Running", "Atheletics")));
		list.add(new Student("Shatrughan G", 4, 1.9, "Male", Arrays.asList("Photography","Swimming", "Archiery", "All")));
		list.add(new Student("Sita G", 1, 2.9, "Female", Arrays.asList("Photography","Swimming", "Archiery", "All")));
		
		return list;
	}
}
