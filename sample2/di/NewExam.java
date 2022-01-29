package sample2.di;

import java.util.Scanner;

public class NewExam implements Exam {
	private int kor;
	private int eng;
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("kor?");
		kor = in.nextInt();
		System.out.println("eng?");
		eng = in.nextInt();
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/2.0f;
	}

}
