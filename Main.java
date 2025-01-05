import java.util.*;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static String[]menu = new String[9];
    public static String[]contorni = new String[3];

    public static void main(String[] args) {
        boolean I = true;
        do {
            printMenu("menu");
            System.out.println("X per terminare il programma");
            String scelta = in.next();
            if (scelta.equals("frittata")||scelta.equals("caprese")||scelta.equals("carne alla griglia")) {
                System.out.println("Contorno?");
                String contorno = in.next();
                Cuoco.cucinare(scelta, contorno);
            } else {
                Cuoco.cucinare(scelta);
            }
            if (scelta.equals("X")|| scelta.equals("x")) I = false;
        }while (I);
    }

    public static void printMenu(String sel){
        switch (sel){
            case "menu" -> {
                for(String P1 : menu){
                    System.out.println(P1);
                }
            }
            case "contorni" -> {
                for (String P2 : contorni){
                    System.out.println(P2);
                }
            }
        }
    }
}