package com.geekbrains.HomeWork2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Массив не соответствует размерам 4х4");
    }
}
