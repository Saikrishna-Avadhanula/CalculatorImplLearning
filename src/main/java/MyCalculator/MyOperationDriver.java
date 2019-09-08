package MyCalculator;

public class MyOperationDriver {


    MyCalcOperations myCalcOperations= new MyCalcOperations();
    static int OperationsPerformed ;
    static int result;
    MyOperationDriver(){
        OperationsPerformed++;
    }


    void Add(int num1, int num2){
        myCalcOperations.setNum1(num1);
        if(OperationsPerformed>1){
            myCalcOperations.setNum1(result);
        }
        myCalcOperations.setNum2(num2);
        result = myCalcOperations.addition();
        System.out.println("Result for Addition of: "+myCalcOperations.getNum1()+" , "+ myCalcOperations.getNum2()+" is "+result  );
    }






}
