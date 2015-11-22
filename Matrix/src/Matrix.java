/**
 * Класс матрица с набором функций
 */
public class Matrix {
    int column;
    int row;
    int[][] Array;

    public Matrix(int row, int column) {

        this.column = column;
        this.row = row;
        Array = new int[row][column];
    }
    public Matrix(int[][] a, int row, int column) {
        this.column = column;
        this.row = row;
        Array = new int[row][column];
        for(int i = 0;i < row; i++){
            for(int j = 0;j < column; j++) {
                Array[i][j] = a[i][j];
            }
        }
    }
    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Array[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println();
    }
    /**
     * Функция умножения матриц
     */
    public Matrix mult(Matrix b) {
        Matrix tmp = new Matrix(this.row,b.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.column; j++) {
                int res = 0;
                for (int k = 0; k < this.column; k++) {
                    res = this.Array[i][k] * b.Array[k][j] + res;
                }
                tmp.Array[i][j] = res;
            }
        }
        return tmp;
    }
    /**
     * получение элемента
     */
    public int getElem(int raw, int column) {
        if (raw >= 0 && column >= 0) {
            return Array[raw][column];
        }
        else return 0;
    }
    /**
     * задание элемента
     */
    public void SetElem(int elem, int row, int column) {
        if (row >= 0 && column >= 0) {
            Array[row][column] = elem;
        }
    }
    /**
     * складывать можно только одинаковые матрицы
     */
    private boolean isSameSize(Matrix a) {
        return (a.column == this.column && a.row == this.row);
    }
    /**
     * сложение матриц
     */
    public Matrix summ(Matrix b) {
        Matrix tmp = new Matrix(this.row,this.column);
        if(this.isSameSize(b)&& this.isSameSize(this)){
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.column; j++) {
                    tmp.Array[i][j] = this.Array[i][j] + b.Array[i][j];
                }
            }
        }
        else
            System.out.println("Arrays size error!");
        return tmp;
    }
    /**
     * поиск детерменанта
     */
    public int determinant(){
        int det = 0;
        if(!(this.isSquare(this))) {
            System.out.println("Matrix isn't square!");
            return 0 ;
        }
        else {
            if (this.row == 1)
                return this.Array[0][0];
            else if (this.row == 2)
                return (this.Array[0][0]*this.Array[1][1] - this.Array[0][1]*this.Array[1][0]);
            else {
                for(int i = 0; i < this.column; i++)
                    if(i%2 !=0) {
                        Matrix current;
                        current = subMatrix(this, i);
                        det = det - this.Array[0][i] * current.determinant();
                    }
                    else {
                        Matrix current = subMatrix(this, i);
                        det = det + this.Array[0][i] * current.determinant();
                    }
            }
        }
        return det;
    }

    /**
     * упрощение матрицы для поиска детерменанта
     */
    private Matrix subMatrix(Matrix a, int col){
        Matrix res = new Matrix(a.row - 1,a.column - 1);
        for (int i = 1; i < a.row; i++) {
            int k = 0;
            for (int j = 0; j < a.column; j++) {
                if(j != col){
                    res.Array[i-1][k] = a.Array[i][j];
                    k++;
                }

            }
        }
        return res;
    }
    /**
     * проверка на квадратность матрицы
     */
    private static boolean isSquare(Matrix a){
        return (a.column == a.row);
    }
    /**
     * Возврат матрицы из экземпляра класса Matrix для тестов
     */
    public int[][] getMassive() {
        return Array;
    }
}