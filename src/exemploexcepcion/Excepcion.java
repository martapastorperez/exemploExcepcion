package exemploexcepcion;

public class Excepcion extends Exception {

    public Excepcion() {

        super("Informamos da nosa excepcion");
    }

    public Excepcion(String s) {
        super(s);
    }
}
