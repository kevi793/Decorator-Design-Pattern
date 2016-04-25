public class Mozarella extends ToppingsDecorator{

	public Mozarella(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", Mozarella";
	}
	
	public double getCost(){
		return tempPizza.getCost() + 0.05;
	}

}
