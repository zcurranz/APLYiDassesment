package src;

public abstract class Person implements Potato{
    
    private String name;

    @Override
    public void greet() {
        System.out.printf(returnNameInBrackets() + "Hi guys, I'm " + name + "\n");
    }

    @Override
    public void grumble() {
        System.out.printf(returnNameInBrackets() + "Grmblblblbl" + "\n");
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
}
