public class Hombre {
    private String nombre;
    private int ID;

    public Hombre() {
    }

    public Hombre(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void jugarConRobot(Robot robot, int opc, int pasos) {
        switch (opc) {
            case 1 -> robot.avanzar(pasos);
            case 2 -> robot.retroceder(pasos);
            case 3 -> robot.getBateria();
            case 4 -> robot.dormir();
            case 5 -> robot.despertar();
            case 6 -> robot.recargar();
        }
        robot.avanzar(pasos);
    }
}
