package week6;

public class GraduateTwo extends Graduate{
	private String uni;
	private String dept;
	private String major;
	private int num;
	private String name;
	private int grade;
	public void setUni(String uni) {
		this.uni=uni;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	@Override
	public String GradResult() {
		if(grade>=120) {
			return "졸업 가능";
		}
		else
			return "졸업 유보";
	}
	@Override
	public void printGrad() {
		System.out.printf("1. %s",uni);
		System.out.printf("2. %s",dept);
		System.out.printf("3. %s",major);
		System.out.printf("4. %d",num);
		System.out.printf("5. %s",name);
		System.out.printf("6. %d",grade);
		System.out.printf("7. %s",GradResult());
	}
}
