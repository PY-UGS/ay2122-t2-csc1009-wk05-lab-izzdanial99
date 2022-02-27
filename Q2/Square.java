public class Square extends Shape{

    public Square(double dim1, double dim2)
    {
        super(dim1, dim2);
    }

    public double area()
    {
        System.out.println("Inside Area for Square");
        return this.getDim1() * this.getDim2();
    }
}
