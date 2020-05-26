import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void StringSplitTest() {
        String[] expected = {"ab", "c_"};
        String[] expected2 = {"ab", "cd", "ef"};
        assertEquals(expected, solution.stringSplit("abc"));
        assertEquals(expected2, solution.stringSplit("abcdef"));
    }
}