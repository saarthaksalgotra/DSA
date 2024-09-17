package OOPS;

class Account{

    public String name;     // available for all packages;
    protected String email;  // available to subclasses of another package;
    private int pin;    // available only in Account class, use getters and setters to access it outside;

    public int getPin()
    {
        return this.pin;
    }

    public void setPin(int p)
    {
        this.pin = p;
    }

    public void accountInfo()
    {
        System.out.println(this.name + " & " + this.email);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        {
            a1.name = "Saarthak";
            a1.email = "saarthak@gmail.com";
            a1.accountInfo();
            a1.setPin(1212);
            System.out.println(a1.getPin());
        }
    }
}
