package week6;

public abstract class Graduate implements Grad{
	private String uni;
	private String dept;
	private String major;
	private int num;
	private String name;
	private int grade;
	public Graduate() {
		this.major="기술 융합";
		this.num=20198263;
	}
	public abstract String GradResult();
	public void printGrad() {
		System.out.printf("1. %s",major);
		System.out.printf("2. %d",num);
		System.out.printf("3. %s", GradResult());
	}
}
