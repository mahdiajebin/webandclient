package edu.school.service;

public class TooMuchWaterException extends Exception {
    public TooMuchWaterException() {
        super("Water was not turned off");
    }
}