package homework.object5;

public class Student {
	private String name;
	private String cls;
	static private int clsNo;

	Student(){
		clsNo+=1;
	}
	public int getClsNo() {
		return clsNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}
	
}
