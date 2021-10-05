package src;

public class Dev extends Person {
    private String superPowerCatchphrase = "HIAAAAAAAA !";
    private boolean hasStartedStory = false;
    //Is set to true initially so that the dev can aquire a new story 
    private boolean hasFinishedStory = true;
    private int currentStoryNumber;
    
    
    public Dev(String name)
    {
        this.setName(name);
    }

    public Dev(String name, String catchphrase)
    {
        this.setName(name);
        this.superPowerCatchphrase = catchphrase;
    }

    @Override
    public void invokePower() {
        System.out.println(this.returnNameInBrackets() + superPowerCatchphrase);
    }

    public void takeNewStory()
    {
        if(hasFinishedStory == true)
        {
            currentStoryNumber = Shortcut.giveNewStory();
            hasStartedStory = true;
            hasFinishedStory = false;
            System.out.println(this.returnNameInBrackets() + "Ok, working on " + Shortcut.formatStoryNumber(currentStoryNumber));
        }
        else
            System.out.println(this.returnNameInBrackets() + "I need to finish my task before taking another one");
    }

    public void work()
    {
        if(hasStartedStory == true)
        {
            System.out.println(this.returnNameInBrackets() + "I am working on " + Shortcut.formatStoryNumber(currentStoryNumber) + ", Pr up soon!"); 
        }
        else
            System.out.println(this.returnNameInBrackets() + "I need a new Story!");

    }

    public void finishStory()
    {
        if(hasFinishedStory == false && hasStartedStory == true)
        {
            System.out.println(this.returnNameInBrackets() + Shortcut.formatStoryNumber(currentStoryNumber) + " done, PR up !");
            hasStartedStory = false;
            hasFinishedStory = true;
        }
        else 
            System.out.println(this.returnNameInBrackets() + "I can't finish something I haven't started");
    }

    @Override
    public void getDummyTrophy() {
        System.out.println(this.returnNameInBrackets() + "I've been a potato and deserve my dummy trophy");

    }

    //For the dragonball z fans
    public void doPairProgramming(Dev otherDev)
    {
        if(otherDev.getName() != null && this.getName() != otherDev.getName())
        {
            System.out.println(this.getName() + " and " + otherDev.getName() +" have been watching too much Dragonball and are attempting to perform the fusion dance!");
            System.out.println("Luckily they simply did pair programming instead.");
        }
        else
            System.out.println(this.getName() + "... You need a real partner to be able to do pair programming.");
    }
    
}
