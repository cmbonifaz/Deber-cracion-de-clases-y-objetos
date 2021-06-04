package clases;

public class cuadrilatero {

    int lado1;
    int lado2;

    public cuadrilatero(int lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void perimetro() {
        int resPer = (2 * this.lado1) + (2 * this.lado2);
        System.out.println("El perimetro es: " + resPer);
    }

    public void area() {
        int resAre = this.lado1*this.lado2;
        System.out.println("El area es: " + resAre);
    }
}
