package p210917;

import java.util.Scanner;

public class test2 {
	String name;
	int middle;
	int fin;
	
	public void input() {
		Scanner in=new Scanner(System.in);
		System.out.println("이름, 중간고사, 기말고사 점수를 입력하세요");
		name=in.next();
		middle=in.nextInt();
		fin=in.nextInt();
	}
	public int sum() {
		return middle+fin;
	}
	public double avg() {
		return sum()/2.0;
	}
	public void print() {
		System.out.printf("이름 : "+name+"\n총점 : "+sum()+"\n평균 : %.2f",avg());
	}
	public static void main(String[] args) {
		test2 t=new test2();
		t.input();
		t.print();
	}
}
