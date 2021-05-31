package Lesson2;

public class MyArrayDataException extends RuntimeException{
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Неправильные данные. У вас: строка" + i + ", столбец " + j);
        this.i = i;
        this.j = j;
    }
}
