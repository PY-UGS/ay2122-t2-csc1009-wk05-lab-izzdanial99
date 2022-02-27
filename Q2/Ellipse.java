public class Ellipse extends Shape{

    public Ellipse(double dim1, double dim2)
    {
        super(dim1, dim2);
    }
    public double area()
    {
        System.out.println("Inside Area for Ellipse");
        return this.getPI() * this.getDim1() * this.getDim2();
    }
}