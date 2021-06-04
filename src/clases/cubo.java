package clases;

public class cubo {

    int ancho;
    int alto;
    int profundo;

    public cubo() {
        System.out.println("por favor inserte 3 valores");
    }

    public cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public void resultado() {
        int resul = this.ancho * this.alto * this.profundo;
        System.out.println("El resultado es " + resul);

    }

}
