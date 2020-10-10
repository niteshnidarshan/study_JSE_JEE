package core.java.stream.student;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class NameAsKeyInMapWithStream {
	public static void main(String[] args) {
		Map<String, Student> map = StudentRepository.getStudents().stream().sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toMap(Student::getName, student->student));
		
		map.forEach((k,v)->{System.out.println(k+" | "+v);}); 
	} 

}
