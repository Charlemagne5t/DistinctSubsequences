import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numDistinctTest1() {
        String s = "rabbbit";
        String t = "rabbit";
        int output = 3;
        Assert.assertEquals(output, new Solution().numDistinct(s, t));
    }
    @Test
    public void numDistinctTest2() {
        String s = "babgbag";
        String t = "bag";
        int output = 5;
        Assert.assertEquals(output, new Solution().numDistinct(s, t));
    }
}
