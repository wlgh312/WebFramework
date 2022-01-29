package week10_1;

public class Graduate implements Grad{
	private String major;
	private int num;
	private GraduateTwo gt;
	public Graduate(String major, int num, GraduateTwo gt) {
		this.major=major;
		this.num=num;
		this.gt=gt;
	}
	public void printGrad() {
		System.out.printf("1. %s\n",major);
		System.out.printf("2. %d\n",num);
		System.out.printf("3. %s\n", gt.GradResult());
	}
}
