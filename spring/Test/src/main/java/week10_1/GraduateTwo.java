package week10_1;

public class GraduateTwo{
	private String dept;
	private String name;
	private int grade;
	public GraduateTwo(String dept, String name, int grade) {
		this.dept=dept;
		this.name=name;
		this.grade=grade;
	}
	public String GradResult() {
		if(grade>=120) {
			return "졸업 가능";
		}
		else
			return "졸업 유보";
	}
	public void printGrad() {
		System.out.printf("1. %s",dept);
		System.out.printf("\n2. %s",name);
		System.out.printf("\n3. %d",grade);
	}
}
