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
        if(this.rule1()&& this.rule2())
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




}
