package week2_hw;
import java.util.Scanner;

public class Score implements ScoreInEx{
	private String name;
	private double middle;
	private double fin;
	private String pass;
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("이름과 중간성적, 기말 성적을 차례로 입력하세요 : ");
		name = in.next();
		middle = in.nextDouble();
		fin = in.nextDouble();
	}
	@Override
	public double sum() {
		return middle+fin;
	}
	@Override
	public double avg() {
		return sum()/2;
	}
	@Override
	public char grade() {
		if(avg()>=90 && avg()<=95)
			return 'A';
		else if(avg()>=80 && avg()<=85)
			return 'B';
		else if(avg()>=70 && avg()<=75)
			return 'C';
		else if(avg()>=60 && avg()<=65)
			return 'D';
		else
			return 'F';
	}
	public void print() {
		if(grade()=='B' || grade()=='A')
			pass="합격";
		else
			pass="불합격";
		System.out.printf("이름 :%s\n"
				+ "중간성적 :%.2f\n"
				+ "기말성적:%.2f\n"
				+ "총합:%.2f\n"
				+ "평균:%.2f\n"
				+ "학점:%s\n"
				+ "합격여부:%s",name, middle, fin, sum(), avg(), grade(),pass);
	}
}
