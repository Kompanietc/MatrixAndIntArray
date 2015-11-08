import static org.junit.Assert.*;

/**
 * Created by admin on 05.11.15.
 */
public class DeterminantTest {

    @org.junit.Test
    public void testDeterminant() throws Exception {
        int m [][] = {{8,1,2},{3,4,5},{6,7,8}};
        Matrix mat = new Matrix(m,3,3);
        int res = -24;
        assertEquals(res, Matrix.determinant(mat));
    }
}