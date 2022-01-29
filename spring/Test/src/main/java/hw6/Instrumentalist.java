package hw6;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer{
	private String name;
	private int mid;
	private int fin;
	@Autowired
	public Instrumentalist() {
		
	}
	@Override
	public void perform() {
		System.out.println("이름 : "+name);
		System.out.println("점수 총합 : "+(mid+fin)+"\n점수 평균 : "+(mid+fin)/2);
	}
}
