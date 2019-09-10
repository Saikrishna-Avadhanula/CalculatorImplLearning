package MyCalculator;
import CalculatorPackage.*;
import Config.LoggerBase;


public class MyCalcOperations extends LoggerBase implements ICalcOperation {
    LoggerBase loggerBase = new LoggerBase();
    private int iNum1, iNum2;
    private double dNum1, dNum2;
    private double result;

    public double getdNum1() {
        return dNum1;
    }

    public void setdNum1(double dNum1) {
        this.dNum1 = dNum1;
    }

    public double getdNum2() {
        return dNum2;
    }

    public void setdNum2(double dNum2) {
        this.dNum2 = dNum2;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    public int getiNum1() {
        return iNum1;
    }

    public void setiNum1(int iNum1) {
        this.iNum1 = iNum1;
    }

    public int getiNum2() {
        return iNum2;
    }

    public void setiNum2(int iNum2) {
        this.iNum2 = iNum2;
    }



    public int addition(int num1, int num2) {
        loggerBase.info("Starting Addition Operation");
        try {
            result = num1+num2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return (int)result;
    }

    @Override
    public double addition() {
        loggerBase.info("Addition of double numbers started");
        result = dNum1+dNum2;
        return result;
    }

    public double subtraction() {
        loggerBase.info("Starting Addition Operation");
        try {
            result = dNum1 - dNum2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return result;
    }

    public double multiplication() {
        loggerBase.info("Starting Addition Operation");
        try {
            result = dNum1 * dNum2;
        }
        catch(Exception e){
            loggerBase.error("Execption Occured: "+e.getMessage());
        }
        return result;
    }

    public double divide() {
        loggerBase.info("Starting Division Operation");
        try {
            result = dNum1 / dNum2;
        }
        catch(Exception e){
            loggerBase.error("Execption occured during division of"+ dNum1 +","+ dNum2 +" :: "+e.getMessage());
        }
        return result;
    }


}
