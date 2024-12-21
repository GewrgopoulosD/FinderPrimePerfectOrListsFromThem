
import java.security.spec.NamedParameterSpec;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author dimitrisgeorgopoulos
 */
public class main {

    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number1; //metavliti gia na elenxo an o arithmos einai protos
        int number2; //metavliti gia na elenxo an o arithmos einai teleios
        int number3; //metavliti gia tin arxi tou evrous ton proton
        int number4; //metavliti gia to telos tou evrous ton proton
        int number5; //metavliti gia tin arxi tou evrous ton teleion
        int number6; //metavliti gia to telos tou evrous ton teleion

        int epilogi; //matavliti gia tin epilogi tou "menou" tou programmatos
        String sinexia = ""; //metavliti gia to an o xristis thelei na sinexisei to programma 
        boolean stop = false; //an stin apo pano metavliti o xristis pei oxi tha thesei to stop se true kai tha termatisei i loupa
        do { //arxiki loupa programmatos 
            do { //loupa gia na epileksi o xristis poia epilogi tha kanei
                System.out.print("Επιλογή 1. Έλεγχος αν ένας αριθμός είναι πρώτος " + "\n" //menou epilogon
                        + "Επιλογή 2. Έλεγχος αν ένας αριθμός είναι τέλειος: " + "\n"
                        + "Επιλογή 3. Εύρεση όλων των πρώτων αριθμών σε ένα εύρος " + "\n"
                        + "Επιλογή 4. Εύρεση όλων των τέλειων αριθμών σε ένα εύρος " + "\n"
                        + "Κάντε μια επιλογή μεταξύ 1-4 :");
                if (scanner.hasNextInt(5)) { //prospathoume na min skasei to programma o xristis me lathos eisodous 
                    epilogi = scanner.nextInt();
                    if (epilogi > 0) {// an i epilogi einai 1-4
                        break; //diakoptoume tin loupa 
                    }
                } else { //allios sinexizei me afto to minima 
                    System.out.println("       !! Έγκυροι αριθμοί 1 - 4 !!");
                }
                scanner.nextLine(); //diagrafei tin proigoumeni("lanthasmeni") timi kai kataxorei tin sosti (an einai sosti)
            } while (true);
            

            //CHECK GIA PROTO//
            if (epilogi == 1) {//des simioseis apo pano!
                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ : ");
                    if (scanner.hasNextInt()) {
                        number1 = scanner.nextInt();
                        if (number1 > 0) {
                            break;
                        }
                    } else {
                        
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!" );
                    }
                    scanner.nextLine();
                } while (true);
                isPrime.check(number1);
            }

            //CHECK GIA TELEIO//
            if (epilogi == 2) {
                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ : ");
                    if (scanner.hasNextInt()) {
                        number2 = scanner.nextInt();
                        if (number2 > 0) {
                            break;
                        }
                    } else {
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!");
                    }
                    scanner.nextLine();
                } while (true);
                isPerfect.printPerfectNumber(number2);
            }
            //check gia evros proton arithmon//
            if (epilogi == 3) {
                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ για την αρχή του εύρους : ");
                    if (scanner.hasNextInt()) {
                        number3 = scanner.nextInt();
                        if (number3 > 0) {
                            break;
                        }
                    } else {
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!");
                    }
                    scanner.nextLine();
                } while (true);

                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ για το τέλος του εύρους : ");
                    if (scanner.hasNextInt()) {
                        number4 = scanner.nextInt();
                        if (number4 > 0) {
                            break;
                        }
                    } else {
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!");
                    }
                    scanner.nextLine();
                } while (true);

                isPrime.getPrimesInRange(number3, number4);
            }
            //check gia evros telion arithmon//
            if (epilogi == 4) {
                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ για την αρχή του εύρους : ");
                    if (scanner.hasNextInt()) {
                        number5 = scanner.nextInt();
                        if (number5 > 0) {
                            break;
                        }
                    } else {
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!");
                    }
                    scanner.nextLine();
                } while (true);

                do {
                    System.out.print("Δώστε μου έναν ΑΚΈΡΑΙΟ αριθμό μεγαλύτερο του ΜΗΔΕΝΌΣ για το τέλος του εύρους : ");
                    if (scanner.hasNextInt()) {
                        number6 = scanner.nextInt();
                        if (number6 > 0) {
                            break;
                        }
                    } else {
                        System.out.println("       !! Έγκυροι αριθμοί 1 - 2.147.483.647 !!");
                    }
                    scanner.nextLine();
                } while (true);
                List<Integer> perfectNumbers = isPerfect.findPerfectNumbers(number5, number6);
                isPerfect.printPerfectList(perfectNumbers);
            }
            //erotisi gia sinexia//
            do {
                System.out.print("Θέλετε να συνεχίσετε την εφαρμογή; ");
                sinexia = scanner.next().toLowerCase();
                if (sinexia.equals("nai") || sinexia.equals("ναι")
                        || sinexia.equals("oxi") || sinexia.equals("οχι")) {
                    break;
                } else {
                    System.out.println("   !!  Έγκυρες απαντήσεις ναι/nai ή οχι/oxi  !!");
                }
                scanner.nextLine();

            } while (true);

            if (sinexia.equals("oxi") || sinexia.equals("οχι")) {
                stop = true;
                System.out.println("Ευχαριστώ για τον χρόνο σας!");
                System.exit(0);
               
            }
        } while (stop = true );
       
    }
}
