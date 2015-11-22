import static org.junit.Assert.assertEquals;

public class CompareTest {

    @org.junit.Test
    public void firstCompareTest() throws Exception {
        int firstArray [] = {5,6,7};
        int secondArray [] = {6,6,7};
        System.out.println(IntUtil.compare(firstArray, secondArray));
        boolean res = false;
        assertEquals(res,IntUtil.compare(firstArray, secondArray));
    }
    @org.junit.Test
    public void secondCompareTest() throws Exception {
        int firstArray [] = {5,6,7};
        int secondArray [] = {5,6,7};
        System.out.println(IntUtil.compare(firstArray, secondArray));
        boolean res = true;
        assertEquals(res,IntUtil.compare(firstArray, secondArray));
    }
    @org.junit.Test
    public void thirdCompareTest() throws Exception {
        int firstArray [] = {0,0,0};
        int secondArray[] = {0,0,0};
        System.out.println(IntUtil.compare(firstArray, secondArray));
        boolean res = true;
        assertEquals(res,IntUtil.compare(firstArray, secondArray));
    }
    @org.junit.Test
    public void fourthCompareTest() throws Exception {
        int firstArray [] = {1,1,1};
        int secondArray [] = {2,2,2,2};
        System.out.println(IntUtil.compare(firstArray, secondArray));
        boolean res = false;
        assertEquals(res,IntUtil.compare(firstArray, secondArray));
    }
}