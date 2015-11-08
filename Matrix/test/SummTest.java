import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Компаниец on 08.11.2015.
 */
public class SummTest {

    @Test
    public void testSumm() throws Exception {
        int n = 2;
        int m = 2;

        int a [][] = {{1,2},{2,3}};//massive n*m
        int b [][] = {{5,1},{3,1}};//massive m*k
        int c [][] = {{6,3},{5,4}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, n);

        Matrix result = new Matrix(n,n);
        result.summ(mat,mat1);

        assertArrayEquals(c,result.getMassive());
    }
}