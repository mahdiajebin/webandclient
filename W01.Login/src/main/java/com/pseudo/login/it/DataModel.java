package com.pseudo.login.it;

public class DataModel {
    private String month;
    private double value;

    public DataModel(String month, float value) {
        this.month = month;
        this.value = value;
    }



    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "month='" + month + '\'' +
                ", value=" + value +
                '}';
    }
}
