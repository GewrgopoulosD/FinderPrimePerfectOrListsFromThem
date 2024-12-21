
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dimitrisgeorgopoulos
 */
public class isPrime {

    public static void check(int number) {
        if (number <= 1) {//kanenas arithmos isos i mikroteros tou 1 den einai protos ara tous akyronoyme 
            System.out.println("Ο αριθμός " + number + " δεν είναι πρώτος!");
            return;//termatizoume tin methodo kai girname ton elenxo ekei pou egine i klisi tis methodou
        }
        if (number <= 3) {//to dio einai protos ara to dilonoume
            System.out.println("Ο αριθμός " + number + " είναι πρώτος!");
            return;//antistixa des pano
        }
        if (number % 2 == 0 || number % 3 == 0) {//an o arithmos modulo 2 h 3 ison me miden den einai protos dioti diereite me ton eafto tou to 1 kai akomi arithmous
            System.out.println("Ο αριθμός " + number + " δεν είναι πρώτος!");
            return;
        }

        for (int i = 5; i * i <= number; i = i + 2) {//i loupa trexei apo to 5 giati exoume tsekarei ta proigoumena stoixeia 
                                                     //kai proxoraei me vima +2 giati oi zygoi den einai telioi
            if (number % i == 0) {//an o arithmos diereitai akrivos me kati akoma pera apo ton eafto tou kai to 1 den einai protos 
                System.out.println("Ο αριθμός " + number + " δεν είναι πρώτος!");
                return;
            }
        }

        System.out.println("Ο αριθμός " + number + " είναι πρώτος!");
    }
    
    
    public static List<Integer> getPrimesInRange(int start, int end) {//ftiaxnoume mia lista pou den kseroume poses theseis theloume na exei
        boolean[] isPrime = new boolean[end + 1];//ftiaxnoume ena pinaka bool me sin 1 thesi apo afti pou edose o xristis gia telos
        for (int i = 2; i <= end; i++) {//ksekiname tin loopa apo to 2 dioti to 1 sigoura den einai protos
            isPrime[i] = true;//tous orizoume olous protous
        }

        for (int j = 2; j * j <= end; j++) {//ksekiname apo to 2 pou einai protos mexri to telos me vima ta polaplasia tou
            if (isPrime[j]) {
                for (int i = j * j; i <= end; i += j) {//thetoume ola ta pollaplasia tou false
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();//dimiourgoume mia lista gia na apothikefsoume tous "pragmatikous" protous arithmous
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) {
                primes.add(i);//tous apothikevoume 
            }
        }
        if(primes.isEmpty()){
        System.out.println("Δεν βρέθηκαν πρώτοι αριθμοί.");//ektiponoume tin lista
        }else {
            System.out.println("Πρώτοι αριθμοί στο εύρος που δώσατε είναι : " + primes);
        }
        return primes;//tous epistrefoume 
        
    }
}
