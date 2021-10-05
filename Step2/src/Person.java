package src;

public abstract class Person implements Potato{
    
    private String name;

    @Override
    public void greet() {
        System.out.println(returnNameInBrackets() + "Hi guys, I'm " + name);
    }

    @Override
    public void grumble() {
        System.out.println(returnNameInBrackets() + "Grmblblblbl");
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
