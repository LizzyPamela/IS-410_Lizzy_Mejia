public abstract class Figura {

    private double dim1;
    private double dim2;
    private double dim3;
    
    //1  constructor
    public Figura (double dim1)  {
        this.dim1 = dim1;}
    
    //2  constructor
    public Figura (double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;}
    
    //3  constructor
    public Figura (double dim1, double dim2, double dim3){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3; }
    
                                    //Setters y getters:
        //dim 1
    public void setDim1(double dim1)  { this.dim1 = dim1;}

    public double getDim1()   { return dim1; }
    
        //dim2
    public void setDim2(double dim2) { this.dim2 = dim2;}

    public double getDim2()   {return dim2;}
    
        //dim3
    public void setDim3(double dim3) {  this.dim3 = dim3;}

    public double getDim3() { return dim3;}
    


    public abstract double getArea(); // tanto figuras bidimensionales como tridimensionales tendran area
    
    public String getName() {
        return getClass().getName();
    }
    
    @Override
    public String toString(){
        return "Area = " + getArea();
    }
}

