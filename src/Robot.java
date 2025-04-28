public class Robot{
    private Bateria bateria;
    private boolean dormido;
    private String nombre;

    public Robot() {
    }

    public Robot(String nombre) {
        this.bateria = new Bateria(1000);
        this.nombre = nombre;
        this.dormido = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBateria() {
        return bateria.getCarga();
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    public void avanzar(int pasos) {
        int cargaRestante = bateria.getCarga() - (pasos / 10);
        bateria.setCarga(cargaRestante);
    }

    public void retroceder(int pasos) {
        int cargaRestante = bateria.getCarga() - (pasos / 10);
        bateria.setCarga(cargaRestante);
    }

    public void dormir() {
        setDormido(true);
    }

    public void despertar() {
        setDormido(false);
    }

    public void recargar () {
        bateria.setCarga(1000);
    }

    public boolean bateriaLlena() {
        if (bateria.getCarga() == 1000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean bateriaVacia () {
        if (bateria.getCarga() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean estaDormido() {
        return dormido;
    }


}
