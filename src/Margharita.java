public class Margharita extends ToppingsDecorator{

	public Margharita(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", Margharita"; 
	}
	
	public double getCost(){
		return tempPizza.getCost() + 0.75; 
	}
	
}
