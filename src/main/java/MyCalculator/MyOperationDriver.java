package MyCalculator;

public class MyOperationDriver {


    MyCalcOperations myCalcOperations= new MyCalcOperations();
    static int OperationsPerformed ;
    static double result;
    MyOperationDriver(){
        OperationsPerformed++;
    }


    void Add(double num1, double num2){
        myCalcOperations.setdNum1(num1);
        if(OperationsPerformed>1){
            myCalcOperations.setdNum1(result);
        }
        myCalcOperations.setdNum2(num2);
        result = myCalcOperations.addition();
        System.out.println("Result for Addition of: "+myCalcOperations.getdNum1()+" , "+ myCalcOperations.getdNum2()+" is "+result  );
    }

    void sub(double num1, double num2){
        myCalcOperations.setdNum1(num1);
        if(OperationsPerformed>1){
            myCalcOperations.setdNum1(result);
        }
        myCalcOperations.setdNum2(num2);
        result = myCalcOperations.subtraction();
        System.out.println("Result for subtraction of: "+myCalcOperations.getdNum1()+" , "+ myCalcOperations.getdNum2()+" is "+result  );
    }

    void multiply(double num1, double num2){
        myCalcOperations.setdNum1(num1);
        if(OperationsPerformed>1){
            myCalcOperations.setdNum1(result);
        }
        myCalcOperations.setdNum2(num2);
        result = myCalcOperations.multiplication();
        System.out.println("Result for multiplication of: "+myCalcOperations.getdNum1()+" , "+ myCalcOperations.getdNum2()+" is "+result  );
    }

    void divide(double num1, double num2){
        myCalcOperations.setdNum1(num1);
        if(OperationsPerformed>1){
            myCalcOperations.setdNum1(result);
        }
        myCalcOperations.setdNum2(num2);
        result = myCalcOperations.divide();
        System.out.println("Result for divide of: "+myCalcOperations.getdNum1()+" , "+ myCalcOperations.getdNum2()+" is "+result  );
    }


}
