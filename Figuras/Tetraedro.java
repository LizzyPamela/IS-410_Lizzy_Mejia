public class Tetraedro extends FiguraTridimensional{
    //Constructor usando el 3 constructor de figura
	public Tetraedro (double dim1, double dim2, double dim3)	{
		super(dim1, dim2, dim3);}

	private double TetraedroArea = 4 * (0.5 * getDim1() * getDim2()) ; //Calculo de area
	private double TetraedroVolume = ((0.5 * getDim1() * getDim2()) * getDim3())/3; //Calculo de volumen
	
	@Override
	public double getArea()	{
		return TetraedroArea;}
	
	@Override
	public double getVolume()	{
		return TetraedroVolume;}
		
	@Override
	public String toString()	{
		return " Ancho de la Base: " + getDim1() + " Largo de la Base: " + getDim2() + " Altura: " + getDim3();  }
}
