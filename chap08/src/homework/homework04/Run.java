package homework.homework04;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] smt = new SmartPhone[2];
		smt[0]=new GalaxyS24();
		smt[1]= new Iphone15();
		for(SmartPhone sm : smt) {
			sm.getName();System.out.print("는 ");
			sm.printMaker();System.out.println("에서 만들어졌다");
			sm.makeCall();
			sm.takeCall();
			sm.charge();
			sm.touch();
			sm.picture();
			
		}
		
	}
}
