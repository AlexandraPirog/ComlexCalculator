public interface Calculable<T> {

    /** Сложение */
    T addition(T x, T y, T x1,T y1);

    /** Вычитание */
    T subtraction(T x, T y, T x1,T y1);

    /** Умножение */
    T multiplication(T x, T y, T x1,T y1);

    /** Деление */
    T division(T x, T y, T x1,T y1);
    int getResult();
}
