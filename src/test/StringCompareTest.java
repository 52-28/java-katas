import org.junit.Assert;
import org.junit.Test;

public class StringCompareTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    // TODO
    @Test
    public void test1() throws Exception {
        Assert.assertEquals(StringCompare.compare("a","a"),1);
    }

    @Test
    public void test2() throws Exception {
        Assert.assertEquals(StringCompare.compare("a","b"),0);
    }

    @Test
    public void testaaba() throws Exception {
        Assert.assertEquals(StringCompare.compare("aa","ba"),1);
    }

    @Test
    public void testnull() throws Exception {
        Assert.assertEquals(StringCompare.compare(null,"a"),-1);
    }

    @Test
    public void testnullnull() throws Exception {
        Assert.assertEquals(StringCompare.compare(null,null),-1);
    }

    @Test
    public void testcassis() throws Exception {
        Assert.assertEquals(StringCompare.compare("cassis","castor"),3);
    }

    @Test
    public void testLengthNotEqual() throws Exception {
        Assert.assertEquals(StringCompare.compare("tacos","poulpe"),-1);
    }
}
