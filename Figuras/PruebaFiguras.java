public class PruebaFiguras {

    public static void main(String[] args) {
      
        Figura Figura[] = new Figura[6];
        Figura[0] = new Circulo(10.0);
        Figura[1] = new Cuadrado(10.0);
        Figura[2] = new Triangulo(4.0, 5.0);
        Figura[3] = new Esfera(1.0);
        Figura[4] = new Cubo(1.0);
        Figura[5] = new Tetraedro(10.0,12.3,10.4);

         System.out.println("___________________________________________________________________________________\n");
         System.out.println("\t\t\t\t  FIGURAS");
        for (Figura FiguraActual : Figura) {
            System.out.println("___________________________________________________________________________________\n");
            System.out.printf("Figura: %s%n", FiguraActual.getClass().getName());
            System.out.println(FiguraActual);
            if (FiguraActual instanceof FiguraBidimensional) {
                Figura FiguraBidimensional = (Figura) FiguraActual;

                System.out.printf(" Area: %.2f\n"/* , FiguraBidimensional.toString()*/, FiguraBidimensional.getArea());

            } else if (FiguraActual instanceof FiguraTridimensional) {
                FiguraTridimensional FiguraTridimensional = (FiguraTridimensional) FiguraActual;
               
                System.out.printf(" Volumen: %.2f\n"/* , FiguraTridimensional.toString()*/, FiguraTridimensional.getVolume());

                System.out.printf(" Area: %.2f\n"/* , FiguraTridimensional.toString()*/, FiguraTridimensional.getArea());
            }

        }
        System.out.println("___________________________________________________________________________________\n");

    }

}
