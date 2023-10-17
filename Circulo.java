package uscs;

public class Circulo implements FormaGeometrica {
    
    private double raio;
    private static final double pi = 3.14;
    
    
    public Circulo (double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        double area = pi * this.raio * this.raio;
        return area;
    }
        
    @Override
    public double comprimento() {
        double perimetro = 2 * pi * this.raio;
        return perimetro;
    }
    
    public void imprimeCirculo(){
        
        System.out.println("\nA área do círculo é: " + area());
        System.out.println("O perímetro do círculo é: " + comprimento() + "\n");
    }
}