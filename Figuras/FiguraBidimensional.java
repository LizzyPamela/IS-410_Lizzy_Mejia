public abstract class FiguraBidimensional extends Figura{	

	// 1 constructor
	public FiguraBidimensional(double dim1) {
		super(dim1);}
	// 2 constructor
	public FiguraBidimensional(double dim1, double dim2) {
		super(dim1, dim2);}
	
	public abstract double getArea();	
}
