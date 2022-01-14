package week3.assignment;

public class Automation extends MultipleLangauge {
	
    
    public void ruby() {
		System.out.println("Ruby");
		
	}

	public void java() {
		
		System.out.println("Java");
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}
public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java();
		auto.python();
		auto.ruby();
		auto.Selenium();
	}
	

}
