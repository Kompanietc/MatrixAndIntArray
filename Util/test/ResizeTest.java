import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ResizeTest {

    @Test
    public void firstResizeTest() throws Exception {
        int array [] = {5,6,7};
        int result [] = {5,6};
        IntUtil.print(IntUtil.resize(array,2));
        assertArrayEquals(IntUtil.resize(array, 2), result);
    }
    @Test
    public void secondResizeTest() throws Exception {
        int array [] = {5,6,7};
        int result [] = {5,6,7,0};
        IntUtil.print(IntUtil.resize(array,4));
        assertArrayEquals(IntUtil.resize(array, 4), result);
    }
    @Test
    public void thirdResizeTest() throws Exception {
        int array [] = {5,6,7};
        int result [] = {5};
        IntUtil.print(IntUtil.resize(array,1));
        assertArrayEquals(IntUtil.resize(array, 1), result);
    }
}