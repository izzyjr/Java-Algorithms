import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestReverseInParentheses {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"(bar)", "rab"},
                {"foo(bar)baz", "foorabbaz"},
                {"(abc)d(efg)", "cbadgfe"},
                {"foo(bar(baz))blim", "foobazrabblim"}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testReverseInParentheses(String input, String expectedResult) {
        assertEquals(ReverseInParentheses.reverseInParentheses(input), expectedResult);
    }

}
