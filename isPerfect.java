/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dimitrisgeorgopoulos
 */
import java.util.ArrayList;
import java.util.List;

public class isPerfect {

    public static boolean check(int number) {//methodo gia na tsekaroume an i parametros poy mas dinete einai teleios arithmos

        
        int sum = 0; //metavliti gia na arthrizei tous dieretes gia na doume an to arthrisma ton diereton einai iso me ton arithmo
        boolean checkP = false;//thetoume me bool gia na checkaroume ton arithmo
        
        if (number <= 0) {
            return false; //oi telioi arithmoi einai thetikoi   
        }

        List<Integer> dieretes = new ArrayList<>(); //ftiaxnoume mia lista gia tous dieretes xoris na kseroume posoi tha einai
        for (int i = 1; i <= Math.sqrt(number); i++) { //trexoume apo to 1 mexri tin riza tou arithmou
            if (number % i == 0) { //an o arithmos modulo me to i=0 
                dieretes.add(i); // ton prosthetoume stous dieretes
                if (i != number / i) { 
                    dieretes.add(number / i); 
                }
            }
        }

        for (int d : dieretes) {//trexoume tous dieretes 
            sum = sum + d; //prosthetoume sto sum olous tous dieretes
            if (sum == number) { //an to sum(dieretes) == numbrer
                checkP = true;//o number einai teleios 
            }
        }
        return checkP; // kai to epistrefoume 
    }


    public static List<Integer> findPerfectNumbers(int start, int end) { //ftiaxnoume mia methodo pou dexete os parametro tin arxi kai to telos 
        List<Integer> perfectNumbers = new ArrayList<>();//ftiaxnoume mia lista xoris na kseroume megethos
        for (int number = start; number <= end; number++) {//ksekiname tin loopa apo tin arxi pou pirame apo ton xristi eos to telos 
        int sum = 0; // arxikopoioume mia matavliti gia na elenxoume to arthrisma ton diereton
        int sqrt = (int) Math.sqrt(number); //ipologizouume tin riza tou arithmou g

        for (int i = 1; i <= sqrt; i++) {//elenxoume tous arithmous mexri tin riza giati oi megaliteroi tha exoun idi dierethei
            if (number % i == 0) {//an vrethei modulo 
                sum = i + (number / i);//prosthetoume kai ton diereti kai to nnumber/i
            }
        }

        if (sum == number) { //an to arthrisma einai iso me ton arithmo
            perfectNumbers.add(number);//ton prosthetoume stin lista
        }
    }

    return perfectNumbers; //epistrefoume tin lista
}


    public static void printPerfectNumber(int number){//ftiaxnoume ektiposeis gia to an einai teleios 
        if(check(number)){
            System.out.println("Ο αριθμός " + number + " είναι τέλειος:");
        }else {
            System.out.println("Ο αριθμός " + number + " δεν είναι τέλειος:");
        }
    }
    
    public static void printPerfectList(List<Integer> perfectNumbers) { //ftiaxnoume ektiposeis gia to evros ton teleion
    if (perfectNumbers.isEmpty()) {
        System.out.println("Δεν βρέθηκαν τέλειοι αριθμοί.");
    } else {
        System.out.print("Οι τέλειοι αριθμοί στο εύρος που δώσατε είναι: ");
        for (int number : perfectNumbers) {
            System.out.print(number + " , ");
        }
        System.out.println();
    }
}
   
}

