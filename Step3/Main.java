import src.*;

class Main {
  public static void main(String[] args) {
    Person dmitry = new Dev("Dmitry", "Destroys some PR");
    Dev milad = new Dev("Milad", "Cries and pet Bailee");
    Dev andrew = new Dev("Andrew", "Is having merge conflicts");
    Person loz = new Sale("Lawrence");

    dmitry.greet();
    loz.greet();
    milad.greet();

    dmitry.grumble();
    loz.grumble();
    
    milad.takeNewStory();
    milad.work();
    milad.finishStory();

    milad.takeNewStory();
    milad.work();
    milad.finishStory();

    dmitry.invokePower();
    milad.invokePower();

    andrew.work();
    andrew.finishStory();
    andrew.takeNewStory();
    andrew.takeNewStory();
    andrew.work();
    andrew.invokePower();
    andrew.finishStory();

    dmitry.invokePower();
    andrew.getDummyTrophy();
    loz.getDummyTrophy();

    System.out.println();
    dmitry.favouriteTypeOfPotato();
    milad.favouriteTypeOfPotato();
    andrew.favouriteTypeOfPotato();
    loz.favouriteTypeOfPotato();
    milad.doPairProgramming(milad);
    milad.doPairProgramming(andrew);
  }
}

