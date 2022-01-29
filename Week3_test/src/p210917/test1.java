package p210917;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		String name;
		int middle;
		int fin;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("이름, 중간고사, 기말고사 점수를 입력하세요");
		name=in.next();
		middle=in.nextInt();
		fin=in.nextInt();
		sum=middle+fin;
		System.out.println("이름 : "+name+"\n총점 : "+sum+"\n평균 : "+sum/2);
	}
}
