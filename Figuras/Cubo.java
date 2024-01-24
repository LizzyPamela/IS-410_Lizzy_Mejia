public class Cubo extends FiguraTridimensional {
    //Constructor usando el 3 constructor de figura
    public Cubo(double dim1) {
        super(dim1);}
    
    private double CuboArea = 6 * Math.pow(getDim1(), 2.0);
    private double CuboVolume = Math.pow(getDim1(), 3.0);

    @Override
    public double getArea() {
        return CuboArea;}

    @Override
    public double getVolume() {
        return CuboVolume;}
    
    @Override 
    public String toString() {
        return " Lado: " + getDim1();  }
}