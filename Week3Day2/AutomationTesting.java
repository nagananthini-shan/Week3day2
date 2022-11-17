package Week3Day2;

public class AutomationTesting extends MultipleLaunguage implements Automationtool {

	

	public void selenium() {
		
		// TODO Auto-generated method stub
		System.out.println("selenium is Automation tool");
	}

	public void playwright() {
		// TODO Auto-generated method stub
		System.out.println("another automation tool");
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("This is one launguage");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	AutomationTesting obj=new AutomationTesting();
	obj.selenium();
	obj.playwright();
	obj.python();
	obj.ruby();

}

@Override
public void ruby() {
	// TODO Auto-generated method stub
	
}
}