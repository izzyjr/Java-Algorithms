package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRemoveElement {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3, 2, 2, 3}, 3, 2},
                {new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2, 5}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testRemoveElement(int[] nums, int val, int expectedResult) {
        assertEquals(RemoveElement.removeElement(nums, val), expectedResult);
    }
}
