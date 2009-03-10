package dm2;

import dm1.IDMService;

public class Consumer {

	private IDMService service;
	
	public IDMService getService() {
		return service;
	}

	public void setService(IDMService service) {
		this.service = service;
	}
	
	public void start(){
		System.out.println("Initializing Consumer");
		service.sayHello();
	}

	public void stop(){
		System.out.println("Killing Consumer");
		service.sayGoodBye();
	}
	
}
