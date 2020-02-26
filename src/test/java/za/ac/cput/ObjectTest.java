package za.ac.cput;

import org.junit.*;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class ObjectTest {
Object obj1;
Object obj2;
Object obj3;
Object obj4;
    @Before
    public void setUp() throws Exception {
        obj1 = new Object("Steve", 25);
        obj2 = new Object("Steve", 25);
        obj3 = new Object("Moegammad", 30);
        obj4 = new Object("Valery", 28);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquality() {
        Assert.assertEquals(obj1.name+obj1.age, obj2.name+obj2.age);
    }

    @Test
    public void same() {
        assertSame(obj1, obj1);
    }

    @Test
    public void notsame() {
        assertNotSame(obj1, obj2);
    }

    @Test
    public void testFail() {
        fail();
    }

    @Test(timeout = 1000)//failing a test on purpose
    public void timer() {
        try
        {
            sleep(2000);
        }
        catch(InterruptedException e)
        {

        }
    }

    @Ignore ("This doesn't work and should be ignored")
    @Test
    public void junk() {
        assertSame(obj1, obj4);
    }
}