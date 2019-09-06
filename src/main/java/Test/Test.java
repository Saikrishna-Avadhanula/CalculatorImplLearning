package Test;

import Config.LoggerBase;

import java.util.Scanner;

public class Test extends LoggerBase {

    static LoggerBase logger;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name::");

        String userNm = scanner.nextLine();
        System.out.println("User Name :: "+userNm);
        logger.info("User Name :: "+userNm);


    }






}
