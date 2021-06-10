package basic;

public class Employee implements WorkManager{

    @Override
    public String doIt() {
        return "do work";
    }
}
