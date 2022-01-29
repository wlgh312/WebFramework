package hw4_p02;

public class KrPrint implements Print{
	private Name name;
	public KrPrint() {
		this.name=new Name();
	}
	
	public KrPrint(Name name) {
		this.name = name;
	}

	public void setName(Name name) {
		this.name=name;
	}
	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName()+":"+name.getName());
	}
}
