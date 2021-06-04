package truck.load.problem;

public class TruckLoadMainProblem {

	public static void main(String[] args) {

		GetInputFromUser inputFromUsr = new GetInputFromUser();
		// Get the values from the User
		UserInput ui = inputFromUsr.getUserInput();
		TruckLoadAlgorithm truckAlgorithm = new TruckLoadAlgorithm();
		int maxDiff = truckAlgorithm.truckAlgorithmMethod(ui);
		System.out.println("print the value of maxDiff----> " + maxDiff);
	}

}
