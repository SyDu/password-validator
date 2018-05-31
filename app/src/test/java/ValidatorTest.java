import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void test() {

        Validator v=new Validator("asdf");
        boolean b=v.strong();
        assertEquals(false,b);
        v.setPass("password");
        b=v.strong();
        assertEquals(false,b);


    }

}