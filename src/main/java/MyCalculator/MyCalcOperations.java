package MyCalculator;
import CalculatorPackage.*;
import Config.LoggerBase;


public class MyCalcOperations extends LoggerBase implements ICalcOperation {
    LoggerBase loggerBase = new LoggerBase();
    private int num1,num2;
    private double result;

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int addition() {
        loggerBase.info("Starting Addition Operation");
        try {
            result = num1+num2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return (int)result;
    }

    public int subtraction() {
        loggerBase.info("Starting Addition Operation");
        try {
            result = num1-num2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return (int)result;
    }

    public int multiplication() {
        loggerBase.info("Starting Addition Operation");
        try {
            result = num1*num2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return (int)result;
    }

    public double divide() {
        loggerBase.info("Starting Division Operation");
        try {
            result = num1/num2;
        }
        catch(Exception e){
            loggerBase.error("Execption occured during division of"+num1 +","+num2+" :: "+e.getMessage());
        }
        return result;
    }
}
