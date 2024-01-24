public class Triangulo extends FiguraBidimensional {
	
	//Constructor usando el 2 constructor de figura
	public Triangulo(double dim1, double dim2) {
		super(dim1, dim2);}

	private double TrianguloArea = getDim1() * getDim2() * 0.5;
	
	@Override
	public double getArea()	{
		return TrianguloArea;}
	
	@Override 
	public String toString(){
		return " Base: " + getDim1() + " Altura: " + getDim2(); 
	}
}