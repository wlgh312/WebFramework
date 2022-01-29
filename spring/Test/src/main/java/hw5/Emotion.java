package hw5;

public class Emotion implements Hwinter{
	private String day;
	private String em;
	public Emotion() {
		
	}
	public void setDay(String day) {
		this.day=day;
	}
	public void setEm(String em) {
		this.em=em;
	}
	public void Emotion() {
		System.out.println(day+" 기분은 "+em+"했다.");
	}
}
