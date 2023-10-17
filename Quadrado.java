package uscs;

ublic class Quadrado implements FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double area() {
    double area = lado * lado;  
    return area;
    }
    
    
    @Override
    public double comprimento() {
        double perimetro = lado * 4;
        return perimetro;
    }
    
    public void imprimeQuadrado(){
        
        System.out.println("\nA área do quadrado é: " + area());
        System.out.println("O perímetro do quadrado é: " + comprimento() + "\n");
        
    }
}