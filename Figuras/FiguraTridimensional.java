public abstract class FiguraTridimensional extends Figura {
    // 1 constructor
	public FiguraTridimensional(double dim1) {
		super(dim1);}

	// 2 constructor
	public FiguraTridimensional (double dim1, double dim2, double dim3)	{
		super(dim1, dim2, dim3);}
	
	public abstract double getArea();
	public abstract double getVolume(); // todas las figuras tridimensionales tienen volumen
}
