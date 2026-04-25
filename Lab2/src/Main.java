class Luces {
    public void encender() {
        System.out.println("Luces encendidas");
    }

    public void apagar() {
        System.out.println("Luces apagadas");
    }
}

class Pantalla {
    public void bajar() {
        System.out.println("Pantalla bajada");
    }

    public void subir() {
        System.out.println("Pantalla subida");
    }
}

class Proyector {
    public void encender() {
        System.out.println("Proyector encendido");
    }

    public void apagar() {
        System.out.println("Proyector apagado");
    }
}

class SistemaSonido {
    public void encender() {
        System.out.println("Sonido encendido");
    }

    public void apagar() {
        System.out.println("Sonido apagado");
    }
}

class CineEnCasaFacade {
    private Luces luces;
    private Pantalla pantalla;
    private Proyector proyector;
    private SistemaSonido sonido;

    public CineEnCasaFacade(Luces luces, Pantalla pantalla, Proyector proyector, SistemaSonido sonido) {
        this.luces = luces;
        this.pantalla = pantalla;
        this.proyector = proyector;
        this.sonido = sonido;
    }

    public void verPelicula() {
        System.out.println("Preparando cine en casa...");
        pantalla.bajar();
        proyector.encender();
        sonido.encender();
        luces.apagar();
        System.out.println("Cine en casa listo");
    }

    public void terminarPelicula() {
        System.out.println("Apagando cine en casa...");
        sonido.apagar();
        proyector.apagar();
        pantalla.subir();
        luces.encender();
        System.out.println("Cine en casa apagado");
    }
}

public class Main {
    static void main(String[] args) {
        Luces luces = new Luces();
        Pantalla pantalla = new Pantalla();
        Proyector proyector = new Proyector();
        SistemaSonido sonido = new SistemaSonido();

        CineEnCasaFacade cine = new CineEnCasaFacade(luces, pantalla, proyector, sonido);

        cine.verPelicula();
        System.out.println("\n");
        cine.terminarPelicula();
    }
}