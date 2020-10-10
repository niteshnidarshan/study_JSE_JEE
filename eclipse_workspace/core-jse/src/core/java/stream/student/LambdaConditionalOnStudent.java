package core.java.stream.student;

import java.util.List;
import java.util.function.Consumer;

public class LambdaConditionalOnStudent {
	
	/**
	 * 
	 * Lambda supports functional oriented programming where no object creation associated.
	 * Functional programming removes overhead of creating objects & loading class files.
	 * 
	 * This class defines - Chaining of lambda
	 * 
	 */
	
	public static void getConsumerExample() {
		//To make a string in uppercase
		Consumer<String> toUpper = str->System.out.println(str.toUpperCase());
		toUpper.accept("jai ram G ki");
		
	}
	
	//print student name - common
	Consumer<Student> nameDisplayConsumerLambda = student->System.out.println(student.getName()); 
	
	//print activities 
	Consumer<Student> activitiesDisplayConsumerLambda = student -> System.out.println(student.getActiviteis());
	
	public void printNameAndActivitesUsingCondition() {
		StudentRepository.getStudents().forEach(student->{
			if(student.getGrade()>2) {
				//nameDisplayConsumerLambda.accept(student);
				//activitiesDisplayConsumerLambda.accept(student);
				//These two lines can be combined in as :
				nameDisplayConsumerLambda.andThen(activitiesDisplayConsumerLambda).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		
		LambdaConditionalOnStudent s = new LambdaConditionalOnStudent();
		
		getConsumerExample();
		
		//print student name - method call
		//StudentRepository.getStudents().forEach(nameDisplayConsumerLambda);
		
		//andThen example
		//StudentRepository.getStudents().forEach(s.nameDisplayConsumerLambda.andThen(s.activitiesDisplayConsumerLambda));
		//Here, nameDisplayConsumerLambda & activitiesDisplayConsumerLambda can be defined as static - so that no need of instance[s].
		
		s.printNameAndActivitesUsingCondition();

	}

}
