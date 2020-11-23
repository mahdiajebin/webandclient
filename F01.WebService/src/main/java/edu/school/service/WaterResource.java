package edu.school.service;

public class  WaterResource implements AutoCloseable {

    public WaterResource(){
        System.out.println("Water Instantiated ");
    }

    int counter = 0;

    public void on() throws TooMuchWaterException {
        counter ++;
        if (counter > 10)
            throw new TooMuchWaterException();

        System.out.println("Water is on " + counter);
    }

    public void off() throws TooMuchWaterException {
        System.out.println("Water is off");
    }

    @Override
    public void close() throws Exception {
        this.off();
    }
}