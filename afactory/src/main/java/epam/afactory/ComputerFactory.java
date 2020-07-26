package epam.afactory;



public class ComputerFactory {
	public static comput getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
