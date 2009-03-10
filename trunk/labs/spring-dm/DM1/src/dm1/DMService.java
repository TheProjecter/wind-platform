package dm1;

public class DMService implements IDMService{

	public void sayHello() {
		System.out.println("Hello from DMService at DM1");
	}
	

	@Override
	public void sayGoodBye() {
		System.out.println("Good Bye from DMService at DM1");
		
	}
}
