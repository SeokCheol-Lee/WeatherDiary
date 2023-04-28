package com.example.weatherdiary.error;

public class InvalidDate extends RuntimeException {
    private static final String MESSAGE = "너무 미래의 날짜입니다";

    public InvalidDate() {
        super(MESSAGE);
    }
}
