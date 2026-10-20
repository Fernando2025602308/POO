
interface FiguraPlana{
    double calcularArea();
    double calcularPerimetro();
}
abstract class Figura2D implements FiguraPlana{

    public Figura2D(){
        System.out.println("Se imprime una FiguraPlana...\n");
    }
    protected abstract String imprimeFigura();
}

abstract class FiguraRecta extends Figura2D{
    protected int ancho;
    protected int alto;
}

abstract class FiguraCircular extends Figura2D{
    protected int radio;
}

class TrianguloRect extends FiguraRecta{
 public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea() {
        return (double) (ancho * alto) / 2;
    }
    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
        return ancho + alto + hipotenusa;
    }
    @Override
    public String imprimeFigura() {
        return String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f", 
        this.alto, this.ancho, calcularArea(), calcularPerimetro());
    }
}

class Circulo extends FiguraCircular{
    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        return String.format("Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f", 
        this.radio, calcularArea(), calcularPerimetro());
    }
}
public class E2_2 {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3,4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}
