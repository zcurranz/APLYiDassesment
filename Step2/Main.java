import src.*;

class Main {
  public static void main(String[] args) {
    Person eddy = new Dev("Eddy");
    Person andrew = new Dev("Andrew", "Is having merge conflicts");
    Person loz = new Sale("Lawrence");

    eddy.greet();
    loz.greet();

    eddy.grumble();
    loz.grumble();

    andrew.invokePower();
    loz.invokePower();
    eddy.invokePower();
  }
}