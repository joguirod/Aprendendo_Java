package classeCirculo.circulo;

public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public Circulo(){
        this.raio = 0;
    }

    public double CalcularArea(){
        double pi = 3.14;
        double area = this.raio * pi;
        return area;
    }

    public double CalcularPerimetro(){
        double pi = 3.14;
        double perimetro = 2*pi*this.raio;
        return perimetro;
    }

    public void showArea(){
        double area = this.CalcularArea();
        System.out.printf("A área do círculo é %f%n", area);
    }

    public void showPerimetro(){
        double perimetro = this.CalcularPerimetro();
        System.out.printf("O perímetro do círculo é %f%n", perimetro);
    }
}

