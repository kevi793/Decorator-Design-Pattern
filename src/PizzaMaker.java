
public class PizzaMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza basicPizza = new Mozarella(new Margharita(new PlainPizza()));
		System.out.println("Description is :- "+basicPizza.getDescription());
		System.out.println("Cost is :- " + basicPizza.getCost());
	}

}
