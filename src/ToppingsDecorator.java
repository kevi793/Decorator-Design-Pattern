
public abstract class ToppingsDecorator implements Pizza{
	
	protected Pizza tempPizza;
	
	public ToppingsDecorator(Pizza newPizza){
		tempPizza = newPizza;
	}
	
	public String getDescription(){
		return tempPizza.getDescription();
	}
	
	public double getCost(){
		return tempPizza.getCost();
	}
	
}
