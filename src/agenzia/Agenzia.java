package agenzia;

import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int cont = 0;
        Pacchetto[] pacchetti = new Pacchetto[100];
        int choice;
        int costoMedio;
        int min;
        int max;

        do{
            System.out.println("MENU:\n" +
                    "1. aggiungi pacchetto base\n" +
                    "2. aggiungi pacchetto con volo\n" +
                    "3. aggiungi pacchetto con pasti\n" +
                    "4. aggiungi pacchetto con escursioni\n" +
                    "5. visualizza tutti i pacchetti aggiunti\n" +
                    "6. costo medio dei pacchetti\n" +
                    "7. pacchetto con costo massimo e minimo\n" +
                    "0. termina programma");
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("inserisci: destinazione ENTER durata ENTER costo base ENTER");
                    pacchetti[cont] = new Pacchetto(in.next(),in.nextInt(),in.nextDouble());
                    cont++;
                    break;
                case 2:
                    System.out.println("inserisci: destinazione ENTER durata ENTER costo base ENTER volo con ritorno? (true - false)");
                    pacchetti[cont] = new PacchettoVolo(in.next(),in.nextInt(),in.nextDouble(),in.nextBoolean());
                    cont++;
                    break;
                case 3:
                    System.out.println("inserisci: destinazione ENTER durata ENTER costo base ENTER pensione completa? (true - false)");
                    pacchetti[cont] = new PacchettoPasti(in.next(),in.nextInt(),in.nextDouble(),in.nextBoolean());
                    cont++;
                    break;
                case 4:
                    System.out.println("inserisci: destinazione ENTER durata ENTER costo base ENTER pensione completa? (true - false) ENTER numero di escursioni");
                    pacchetti[cont] = new PacchettoEscursioni(in.next(),in.nextInt(),in.nextDouble(),in.nextBoolean(), in.nextInt());
                    cont++;
                    break;
                case 5:
                    for (int i = 0; i< cont ; i++){
                        System.out.println(pacchetti[i]);
                    }
                    break;
                case 6:
                    costoMedio=0;
                    for (int i = 0; i< cont ; i++){
                        costoMedio+=pacchetti[i].calcolaCosto();
                    }
                    costoMedio= costoMedio/cont;
                    System.out.println(costoMedio);
                    break;
                case 7:
                    min = 0;
                    max = 0;
                    for(int i = 0; i<cont; i++){
                        if (pacchetti[i].calcolaCosto()>pacchetti[max].calcolaCosto()){
                            max = i;
                        }else if (pacchetti[i].calcolaCosto()<pacchetti[min].calcolaCosto()){
                            min = i;
                        }
                    }
                    System.out.println(pacchetti[max]);
                    System.out.println(pacchetti[min]);
                    break;
                case 0:
                default:
            }
        }while(choice!=0);
    }
}
