public class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2)
    {
        super(dim1, dim2);
    }
    public double area() 
    {
        System.out.println("Inside Area for Rectangle");
        return this.getDim2() * this.getDim1();
    }

}
