public class Esfera extends FiguraTridimensional {
	//Constructor usando el 1 constructor de figura
	public Esfera(double dim1) {
		super(dim1);}

	private double EsferaArea = 4 * (Math.pow(getDim1(), 2) * Math.PI);
	private double EsferaVolume = Math.PI * 4/3 * Math.pow(getDim1(), 3.0);
	
	@Override
	public double getArea() {
		return EsferaArea;}

	@Override
	public double getVolume() {
		return EsferaVolume;}
	
	@Override 
	public String toString()	{
		return " Radio: " + getDim1(); }
}
