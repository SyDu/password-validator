import java.util.regex.Pattern;

public class Validator {

    private String pass;

    public Validator(String input)
    {
        pass=input;
    }

    public String getPass()
    {
        return pass;
    }

    public boolean strong()
    {
        if(this.rule1()&& this.rule2()&&this.rule5()&&this.rule4()&&this.rule3())
        {
            return true;
        }
        return false;
    }

    public boolean rule1()//rule1: not "password"
    {
        if(this.pass.equals("password"))
        {
            return false;
        }
        return true;
    }
    public void setPass(String x)
    {
        this.pass=x;
    }
    public boolean rule2()
    {
        if(this.pass.length()>=8)
        {
            return true;
        }
        return false;
    }

    public boolean rule3() //rule 3 must having numbers
    {
        return Pattern.compile("[0-9]").matcher(this.pass).find();

    }

    public boolean rule4()//rule must have a lower case
    {

        return Pattern.compile("[a-z]").matcher(this.pass).find();
    }
    public boolean rule5()//rule 5 must have a upper case
    {

        return Pattern.compile("[A-Z]").matcher(this.pass).find();
    }



}
