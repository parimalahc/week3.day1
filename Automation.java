package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {
	
	final String name = "Parimala";

	public void Selenium() {
		System.out.println("Automation using Selenium as a tool");
		
	}

	public void Java() {
		System.out.println("Backend language is Java");
		
	}

	
	public void ruby() {
		System.out.println("Selenium with ruby");
		
	}
	
	public void python() {		
		System.out.println("Selenium with python in Automation class");
	}
	
	public void superUse() {
		super.python();
	}
	
	public static void demo() {
		System.out.println("Static method in automation class");
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Selenium();
		auto.Java();
		auto.ruby();
		auto.python();
		auto.superUse();
		Automation.demo();
		System.out.println("Name is "+auto.name);
		
		
	}

}
