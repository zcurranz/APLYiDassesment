package src;

import java.util.Random;

public abstract class Person implements Potato{
    
    private String name;
    //for the Samwise Gamgee Fans
    private String[] typesOfPotatoes = {"boiled", "mashed", "stuck in a stew", "lovely golden chips with a nice piece of fried fish"};
    Random rand = new Random();

    @Override
    public void greet() {
        System.out.println(returnNameInBrackets() + "Hi guys, I'm " + name);
    }

    @Override
    public void grumble() {
        System.out.println(returnNameInBrackets() + "Grmblblblbl");
    }

    //Overriding this on the person class, as I think everyone but devs would be as confused as Lawrence if they recieved a dummy trophy
    @Override
    public void getDummyTrophy() {
        System.out.println(this.returnNameInBrackets() + "Uuuum what ?");

    }

    //Used to make printing a person's name at the start of a line a bit easier.
    public String returnNameInBrackets()
    {
        return "[" + name + "] ";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void favouriteTypeOfPotato()
    {
        System.out.println(this.returnNameInBrackets() + "I love when Po-ta-toes are " + typesOfPotatoes[rand.nextInt(4)]);
    }

}
