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
        v.setPass("134asdkfghhk");
        b=v.strong();
        assertEquals(false,b);
        v.setPass("234AsasfsOw");
        b=v.strong();
        assertEquals(true,b);
        v.setPass("234asGjkj57HJsO");
        b=v.strong();
        assertEquals(true,b);
        v.setPass("A7678sfssdfsd");
        b=v.strong();
        assertEquals(true,b);

    }

}