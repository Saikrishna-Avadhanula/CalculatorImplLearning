package MyCalculator;

import java.util.Scanner;
import Config.LoggerBase;

public class MyCalcDriver extends  LoggerBase{
    static LoggerBase loggerBase = new LoggerBase();

    public static void main(String[] args){
        loggerBase.info("Driver Script Execution Started....");
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number::");
        num1 = scanner.nextInt();
        boolean calcStatus = true;
        do{
            System.out.println("Operation to perform:: Addition to '+' Subtraction to '-'  Multiplication to '*' Divide to '/' \n type exit to end");
            String str = scanner.next();

            switch(str) {
                case "+":
                    System.out.println("Input second number::");
                     num2 = scanner.nextInt();
                    new MyOperationDriver().Add(num1,num2);
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                case "exit":
                    System.out.println("Number of Operations Performed: " +MyOperationDriver.OperationsPerformed);
                    calcStatus=false;
                    break;
                default:
                    System.out.println("'"+str+"' Case not found");
                    loggerBase.info("'"+str+"' Case not found");
            }
        }while(calcStatus);

    }



}
