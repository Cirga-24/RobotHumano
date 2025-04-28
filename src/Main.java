import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Robot> lstRobots = new ArrayList<Robot>();
    private static List<Hombre> lstUsuarios = new ArrayList<Hombre>();
    private static Scanner teclado = new Scanner(System.in);
    private static Hombre hombreSelec;
    private static Robot robotSelec;

    public static void main(String[] args) throws InterruptedException{
        Robot r1 = new Robot("Raulito");
        Robot r2 = new Robot("Francisco");
        Robot r3 = new Robot("Raúl");
        lstRobots.add(r1); lstRobots.add(r2); lstRobots.add(r3);
        Hombre h1 = new Hombre("Juan", 1234);
        Hombre h2 = new Hombre("Felipe", 3456);
        Hombre h3 = new Hombre("Kevin", 7890);
        lstUsuarios.add(h1); lstUsuarios.add(h2); lstUsuarios.add(h3);
        elegirRobot();
    }

    public static void elegirRobot() throws InterruptedException{
        System.out.println("Elija el usuario que va a interactuar: ");
        int i = 1;
        for (Hombre h : lstUsuarios) {
            System.out.println(i + ". " + h.getNombre());
            i++;
        }
        int h = teclado.nextInt();
        hombreSelec = lstUsuarios.get(h - 1);
        System.out.println("Elija el robot con el que va a interactuar: ");
        i = 1;
        for (Robot r : lstRobots) {
            System.out.println(i + ". " + r.getNombre());
            i++;
        }
        int r = teclado.nextInt();
        robotSelec = lstRobots.get(r -1);
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int pasos = 0;
        System.out.println("Que desea realizar con el robot?" +
                "\n1. Avanzar" +
                "\n2. Retroceder" +
                "\n3. Ver batería" +
                "\n4. Dormir Robot" +
                "\n5. Despertar Robot" +
                "\n6. Recargar Robot");
        int opc = teclado.nextInt();
        if (opc == 1 || opc == 2) {
            System.out.println("Ingrese la cantidad de pasos: ");
            pasos = teclado.nextInt();
        }
        hombreSelec.jugarConRobot(robotSelec, opc, pasos);
    }

    public static void esperarCincoSeg() throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
    }
}