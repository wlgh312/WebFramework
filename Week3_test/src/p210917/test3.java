package p210917;

public class test3 extends test3_1{
	
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
		test3 t=new test3();
		t.input();
		t.print();
	}
}
