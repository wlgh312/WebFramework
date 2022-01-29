package p210917;

public class test4 extends test4_1 implements test4_it{
	public int sum() {
		return middle+fin;
	}
	public double avg() {
		return sum()/2.0;
	}
	@Override
	public void print() {
		System.out.printf("이름 : "+name+"\n총점 : "+sum()+"\n평균 : %.2f",avg());
	}
	public static void main(String[] args) {
		test4 t=new test4();
		t.input();
		t.print();
	}
}
