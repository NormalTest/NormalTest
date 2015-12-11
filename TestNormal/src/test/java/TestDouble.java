import com.normal.test.LargeDoubleDisplay;
import org.testng.annotations.Test;

/**
 * Created by dylanyu on 12/3/2015.
 */
public class TestDouble {
    @Test(groups = "double")
    public void test() {
        LargeDoubleDisplay largeDoubleDisplay = new LargeDoubleDisplay();
        largeDoubleDisplay.displayNormalDouble();
        largeDoubleDisplay.displayFormatDouble();
    }
}
