package epam.single;

public class Single {
	private static Single instance = new Single();
	   
    private Single() {}
    
    public static Single getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("I'm a singleton object!");   
    }
}
