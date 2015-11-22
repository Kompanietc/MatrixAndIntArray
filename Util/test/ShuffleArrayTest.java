import org.junit.Test;

public class ShuffleArrayTest {

    @Test
    public void firstShuffleArrayTest() throws Exception {
        int array[] = {5, 6, 7};
        IntUtil.print(IntUtil.shuffleArray(array));
    }

    @Test
    public void secondShuffleArrayTest() throws Exception {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntUtil.print(IntUtil.shuffleArray(array));
    }
    @Test
    public void thirdShuffleArrayTest() throws Exception {
        int array [] = {1,2};
        IntUtil.print(IntUtil.shuffleArray(array));
    }
}