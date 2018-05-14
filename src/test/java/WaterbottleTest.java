import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {
    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }
    @Test
    public void getVolume(){
        assertEquals(100, waterbottle.getVolume());
    }
    @Test
    public void getDrink(){
        assertEquals(90, waterbottle.getDrink());
    }
    @Test
    public void getEmpty(){
        assertEquals(0, waterbottle.getEmpty());
    }
    @Test
    public void getFilled(){
        assertEquals(100, waterbottle.getFilled());
    }
}
