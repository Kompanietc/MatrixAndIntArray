import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Компаниец on 08.11.2015.
 */
public class SummTests {

    @Test
    public void firstSummTest() throws Exception {
        int n = 2;
        int m = 2;

        int a [][] = {{1,2},
                      {2,3}};

        int b [][] = {{5,1},
                      {3,1}};

        int c [][] = {{6,3},
                      {5,4}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, n);

        Matrix result;
        result = mat.summ(mat1);
        result.print();
        assertArrayEquals(c, result.getMassive());
    }
    @Test
    public void secondSummTest() throws Exception {
        int n = 3;
        int m = 2;

        int a [][] = {{1,2},
                      {2,3},
                      {5,1}};

        int b [][] = {{5,1},
                      {3,1},
                      {2,3}};

        int c [][] = {{6,3},
                      {5,4},
                      {7,4}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, n, m);

        Matrix result;
        result = mat.summ(mat1);
        result.print();
        assertArrayEquals(c,result.getMassive());
    }
}