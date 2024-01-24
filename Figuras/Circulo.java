import java.lang.Math;

public class Circulo extends FiguraBidimensional {
    //Constructor
    public Circulo(double dim1) {
        super(dim1);}
        // Calculo Area del circulo
    private double CirculoArea = (Math.pow(getDim1(), 2) * Math.PI);
    
    @Override
    public double getArea(){
        return CirculoArea;}
    
    @Override 
    public String toString(){
        return " Radio: " + getDim1(); }
    
}