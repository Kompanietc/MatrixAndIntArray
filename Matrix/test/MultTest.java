import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Компаниец on 08.11.2015.
 */
public class MultTest {

    @Test
    public void testMult() throws Exception {
        int n = 2;
        int k = 3;
        int m = 4;

        int a [][] = {{1,2,3,4},{2,3,1,4}};//massive n*m
        int b [][] = {{5,1,2},{5,1,5},{1,3,2},{3,1,3}};//massive m*k
        int c [][] = {{30,16,30},{38,12,33}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, k);

        Matrix result = new Matrix(n,k);
        result.mult(mat,mat1);

        assertArrayEquals(  c,result.getMassive());
    }
}