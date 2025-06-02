package sec01.exam04.quiz;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerday;
	public Equipment() {
	}
	public Equipment(String name, int pricePerday) {
		this.name = name;
		this.pricePerday = pricePerday;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,pricePerday);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		else if (obj instanceof Equipment eq) {
			return eq.name.equals(name)&&eq.pricePerday==pricePerday;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "- " + name + ": " + pricePerday+"원";
		
	}
	
	
}
