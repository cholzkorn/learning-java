package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John", "Smith");
		
		// Get and set methods
		em1.setAlternateEmail("js@gmail.com");
		System.out.println(em1.getAlternateEmail());
		
		// everything automated
		System.out.println(em1.showInfo());
	};

};
