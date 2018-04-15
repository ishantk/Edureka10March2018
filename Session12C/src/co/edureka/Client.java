package co.edureka;

public class Client {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();

	}

}
