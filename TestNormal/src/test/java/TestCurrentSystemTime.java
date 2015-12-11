/**
 * Created by dylanyu on 12/1/2015.
 */

import org.testng.annotations.Test;

public class TestCurrentSystemTime {
    @Test(groups = "test1")
    public void test() {
        System.out.println("test output....");
    }

    @Test(groups = "test1")
    public void test1() {
        System.out.println("Current System Time:" + System.currentTimeMillis());
    }
}
