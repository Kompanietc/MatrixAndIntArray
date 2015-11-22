import static org.junit.Assert.*;

/**
 * Created by admin on 05.11.15.
 */
public class DeterminantTest {

    @org.junit.Test
    public void firstDeterminantTest() throws Exception {
        int m [][] = {{8,1,2},
                      {3,4,5},
                      {6,7,8}};
        Matrix mat = new Matrix(m,3,3);
        int res = -24;
        System.out.print(mat.determinant());
        assertEquals(res, mat.determinant());
    }

    @org.junit.Test
    public void secondDeterminantTest() throws Exception {
        int m [][] = {{1,2},
                      {3,4}};

        Matrix mat = new Matrix(m,2,2);
        int res = -2;
        System.out.print(mat.determinant());
        assertEquals(res, mat.determinant());
    }
    @org.junit.Test
    public void thirdDeterminantTest() throws Exception {
        int m [][] = {{1,2,3},
                      {3,4,5},
                      {3,4,5},
                      {3,4,5}};

        Matrix mat = new Matrix(m,4,3);
        System.out.print(mat.determinant());
    }
}