package epam.afactory;



public class abfactorymain {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		comput pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		comput server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
