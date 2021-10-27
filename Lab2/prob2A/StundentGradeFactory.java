package Lab2.prob2A;

public class StundentGradeFactory {

	public static Student createStudent(String name) {
		if(name == null) 
			throw new IllegalArgumentException("Customer name cannot be null");
		Student stud = new Student(name);

		//Student set in gradeReport
		GradeReport gradeReport = new GradeReport(stud);


		//gradeReport set in Student
		stud.setGradeReport(gradeReport);;

		return stud;
	}

}
