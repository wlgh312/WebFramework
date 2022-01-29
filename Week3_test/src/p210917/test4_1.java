package p210917;

import java.util.Scanner;

public class test4_1 {
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
}
