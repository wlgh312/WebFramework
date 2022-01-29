package week5;

public class Instrumentalist implements Performer{
	private String name;
	private int mid;
	private int fin;
	public Instrumentalist() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMid(int mid) {
		this.mid=mid;
	}
	public void setFin(int fin) {
		this.fin=fin;
	}
	@Override
	public void perform() {
		System.out.println("이름 : "+name);
		System.out.println("점수 총합 : "+(mid+fin)+"\n점수 평균 : "+(mid+fin)/2);
	}
}
