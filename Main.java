import java.util.*;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static String[]menu = new String[9];
    public static String[]contorni = new String[3];

    public static void main(String[] args) {
        initMenu();
        boolean I = true;
        do {
            printMenu("menu");
            System.out.println(" X per terminare il programma");
            System.out.println();
            System.out.println("Scelta: ");
            String scelta = in.next();
            if (scelta.equalsIgnoreCase("frittata")||scelta.equalsIgnoreCase("caprese")||scelta.equalsIgnoreCase("carne alla griglia")) {
                System.out.println("Contorno?");
                String contorno = in.next();
                Cuoco.cucinare(scelta, contorno);
            } else {
                Cuoco.cucinare(scelta);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (scelta.equals("X")|| scelta.equals("x")) I = false;
        }while (I);
    }

    public static void initMenu(){
        menu[0] = "bolognese";
        menu[1] = "siciliana";
        menu[2] = "matriciana";
        menu[3] = "frittata";
        menu[4] = "caprese";
        menu[5] = "carne alla griglia";
        menu[6] = "mascarpone";
        menu[7] = "torta di pinoli";
        menu[8] = "torta della nonna";

        contorni[0] = "verdure grigliate";
        contorni[1] = "verdure impanate";
        contorni[2] = "verdure fritte";
    }
    public static void printMenu(String sel){
        switch (sel){
            case "menu" -> {
                System.out.println("Menu:");
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