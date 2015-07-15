import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by justin on 15/07/15.
 */
public class SolutionTest {

    @Test
    public void test1() {

        String S = "(()(())())";


        Assert.assertEquals(1, new Solution().solution(S));



    }

    @Test
    public void test2() {

        String S = "())";


//        Assert.assertEquals(0, new Solution().solution(S));
        Assert.assertEquals(0, new Solution().solution("("));
        Assert.assertEquals(0, new Solution().solution(")"));
        Assert.assertEquals(0, new Solution().solution("(()"));



    }

}