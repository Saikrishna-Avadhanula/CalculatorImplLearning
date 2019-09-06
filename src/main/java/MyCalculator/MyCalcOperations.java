package MyCalculator;
import CalculatorPackage.*;
import Config.LoggerBase;


public class MyCalcOperations extends LoggerBase implements ICalcOperation {
    LoggerBase loggerBase = new LoggerBase();
    private int num1,num2;

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

        }
        catch(Exception e){

        }
        return 0;
    }

    public void subtraction() {

    }

    public void multiplication() {

    }

    public int divide() {

        int result = num1/num2;
        return result;
    }
}
