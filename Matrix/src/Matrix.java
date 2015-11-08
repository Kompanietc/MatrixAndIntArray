import java.util.Random;
/**
 * Класс матрица с набором функций
 */
public class Matrix {
    int m;
    int n;
    int[][] A;

    public Matrix(int _n, int _m) {

        m = _m;
        n = _n;
        A = new int[n][m];
    }

    public Matrix(int[][] a, int _n, int _m) {
        n = _n;
        m = _m;
        A = a;
    }

    /**
     * Заполнение матриц рандомными значениями
     */
    public void full() {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random rnd = new Random();
                A[i][j] = rnd.nextInt(3);
            }
        }
    }

    /**
     * Сравнивание двух матриц для тестового режима
     */
    public boolean compare(Matrix m1) {
        if (!(m1.n == this.n && m1.m == this.m))
            return false;
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (this.A[i][j] != m1.A[i][j])
                        return false;
                }
            }
        }
        return true;
    }

    /**
     * Вывод матрицы
     */
    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println();
    }

    /**
     * Функция умножения матриц
     */
    public void mult(Matrix a, Matrix b) {
        for (int i = 0; i < a.n; i++)
            for (int j = 0; j < b.m; j++) {
                int res = 0;
                for (int k = 0; k < a.m; k++) {
                    res = a.A[i][k] * b.A[k][j] + res;
                }
                A[i][j] = res;
            }
    }

    /**
     * Возврат матрицы из экземпляра класса Matrix
     */
    public int[][] getMassive() {
        return A;
    }

    /**
     * получение элемента
     */
    public int getElem(int raw, int column) {
        return A[raw][column];
    }

    /**
     * задание элемента
     */
    public void SetElem(int elem, int row, int column) {
        A[row][column] = elem;
    }

    /**
     * проверка размеров матрицы для дальнейшего суммирования
     */
    private boolean sizeCheck(Matrix a) {
        return (a.m == this.m && a.n == this.n);
    }

    /**
     * сложение матриц
     */
    public void summ(Matrix a, Matrix b) {
        if(a.sizeCheck(b)&& this.sizeCheck(a)){
            for (int i = 0; i < a.n; i++) {
                for (int j = 0; j < a.m; j++) {
                    A[i][j] = a.A[i][j] + b.A[i][j];
                }
            }
        }
        else
            System.out.println("Arrays size error!");
    }

    /**
     * поиск детерменанта
     */
    public static int determinant(Matrix a){
        int det = 0;
        if(!(a.isSquare(a))) {
            System.out.println("Matrix isn't square!");
            return 0 ;
        }
        else {
            if (a.n == 1)
                return a.A[0][0];
            else if (a.n == 2)
                return (a.A[0][0]*a.A[1][1] - a.A[0][1]*a.A[1][0]);
            else {
                for(int i = 0; i < a.m; i++)
                    if(i%2 !=0)
                        det = det - a.A[0][i] * determinant(sub_Matrix(a,i));
                    else
                        det = det + a.A[0][i] * determinant(sub_Matrix(a,i));
            }
        }
        return det;
    }

    /**
     * упрощение матрицы для поиска детерменанта
     */
    private static Matrix sub_Matrix(Matrix a, int col){
        Matrix res = new Matrix(a.n - 1,a.m - 1);
        for (int i = 1; i < a.n; i++) {
            int k = 0;
            for (int j = 0; j < a.m ; j++) {
                if(j != col){
                    res.A[i-1][k] = a.A[i][j];
                    k++;
                }

            }
        }
        return res;
    }

    /**
     * проверка на квадротность матрицы
     */
    private static boolean isSquare(Matrix a){
        return (a.m == a.n);
    }

}
