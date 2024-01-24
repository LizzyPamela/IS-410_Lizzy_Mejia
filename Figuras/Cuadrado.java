public class Cuadrado extends FiguraBidimensional {
	// Constructor
	public Cuadrado(double dim1) {
		super(dim1);}

	private double CuadradoArea = getDim1() * getDim1(); 
	
	@Override
	public double getArea(){
		return CuadradoArea;}
	
	@Override 
	public String toString(){
		return " Lado: " + getDim1();}
}