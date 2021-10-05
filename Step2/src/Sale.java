package src;

public class Sale extends Person {

    public Sale(String name)
    {
        this.setName(name);
    }

    @Override
    public void invokePower() {
        System.out.println(this.returnNameInBrackets() + "HIAAAAAAAA !");
   
    }

    @Override
    public void grumble() {
        super.grumble();
        System.out.println(returnNameInBrackets() + "Not gonna hit my target");
    }
}
