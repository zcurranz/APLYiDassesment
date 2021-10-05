package src;

public class Dev extends Person {
    private String superPowerCatchphrase = "HIAAAAAAAA !";
    
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
}
