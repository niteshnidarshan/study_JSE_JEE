package core.java.stream.student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExploreStreamOnStream {
	/**
	 * Stream works on collection of objects.
	 */
	
	static Predicate<Student> gradePredicate = student->student.getGrade()>2;
	static Predicate<Student> gpaPredicate = student->student.getGpa()>3.5;
	
	static List<Student> getFilteredStudent(){
		List<Student> students = StudentRepository.getStudents()
				.stream()//works as a conveyer belt
				.filter(gpaPredicate)//Only those records which satisfy condition
				.filter(gradePredicate)//Only those records which satisfy condition
				.collect(Collectors.toList());//Terminal activity - stream can not be initiated without Terminal activity.
				//Without any terminal activity, stream can not be initiated. Code will run but not initialize the stream on memory.
		
				//peek() - To know what is going on inside the stream like a cctv camera. It can watched through whole conveyer belt & in the filter.
		return students;
	}
	
	static List<Student> getFilteredStudentWithPeek(){
		List<Student> students = StudentRepository.getStudents()
				.stream()//.peek(student->System.out.println("Initiated - "+ student)) 
				.filter(gpaPredicate).peek(student->System.out.println("1st Filter : "+student)) 
				.filter(gradePredicate)//.peek(student->System.out.println("2nd Filter : "+student)) 
				.collect(Collectors.toList()); 
				//peek() - To know what is going on inside the stream like a cctv camera. It can watched through whole conveyer belt & in the filter.
		return students;
	}

	public static void main(String[] args) {

		System.out.println(getFilteredStudent());
		//getFilteredStudentWithPeek();//See peek() execution

	}

}
