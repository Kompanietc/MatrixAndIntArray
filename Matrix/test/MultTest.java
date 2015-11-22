import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Компаниец on 08.11.2015.
 */
public class MultTest {

    @Test
    public void firstMultTest() throws Exception {
        int n = 2;
        int k = 3;
        int m = 4;

        int a [][] = {{1,2,3,4},
                      {2,3,1,4}};

        int b [][] = {{5,1,2},
                      {5,1,5},
                      {1,3,2},
                      {3,1,3}};

        int c [][] = {{30,16,30},
                      {38,12,33}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, k);

        Matrix result;
        result = mat.mult(mat1);
        result.print();
        assertArrayEquals(  c,result.getMassive());
    }
    @Test
    public void secondMultTest() throws Exception {
        int n = 2;
        int k = 2;
        int m = 2;

        int a [][] = {{1,2},
                      {2,3}};

        int b [][] = {{2,1},
                      {3,1}};

        int c [][] = {{8,3},
                      {13,5}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, k);

        Matrix result;
        result = mat.mult(mat1);
        result.print();
        assertArrayEquals(  c,result.getMassive());
    }
    @Test
    public void thirdMultTest() throws Exception {
        int n = 2;
        int k = 2;
        int m = 3;

        int a [][] = {{1,2,3},
                      {2,3,4}};

        int b [][] = {{2,1},
                      {3,1},
                      {4,1}};

        int c [][] = {{20,6},
                      {29,9}};

        Matrix mat = new Matrix(a, n, m);
        Matrix mat1 = new Matrix(b, m, k);

        Matrix result;
        result = mat.mult(mat1);
        result.print();
        assertArrayEquals(  c,result.getMassive());
    }
}