import src.*;

public class Main {
	  public static void main(String[] args) {
	    Potato me = new Dev("Eddy");
	    Person loz = new Sale("Lawrence");

	    me.greet();
	    me.grumble();

	    loz.greet();
	    loz.grumble();
	  }
	}