package Lab2.prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	public Student(String name) {
		this.name=name;

		gradeReport = new GradeReport(this);


	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	public String getName() {
		return name;
	}



}
