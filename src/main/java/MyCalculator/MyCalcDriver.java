package MyCalculator;

import java.util.Scanner;
import Config.LoggerBase;

public class MyCalcDriver extends  LoggerBase{
    static LoggerBase loggerBase = new LoggerBase();

    public static void main(String[] args){
        loggerBase.info("Driver Script Execution Started....");
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number::");
        num1 = scanner.nextDouble();
        boolean calcStatus = true;
        do{
            System.out.println("Operation to perform:: Addition to '+' Subtraction to '-'  Multiplication to '*' Divide to '/' \n type exit to end");
            String str = scanner.next();
            if(!str.equalsIgnoreCase("exit")) {
                System.out.println("Input second number::");
                num2 = scanner.nextDouble();
                switch (str) {
                    case "+":
                        new MyOperationDriver().Add(num1, num2);
                        break;
                    case "-":
                        new MyOperationDriver().sub(num1, num2);
                        break;
                    case "*":
                        new MyOperationDriver().multiply(num1, num2);
                        break;
                    case "/":
                        new MyOperationDriver().divide(num1, num2);
                        break;
                    default:
                        System.out.println("'" + str + "' Operation not defined");
                        loggerBase.info("'" + str + "' Operation not defined");
                }
            }
            else{
                System.out.println("Number of Operations Performed: " + MyOperationDriver.OperationsPerformed);
                calcStatus = false;
            }
        }while(calcStatus);

    }



}
