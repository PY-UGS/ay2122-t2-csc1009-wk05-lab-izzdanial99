import java.util.Date;
public class GeometricObject{

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
        this.dateCreated =  new Date();
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled(boolean filled)
    {
        return this.filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public String toString()
    {
        return ("created on " + getDateCreated() + "\ncolor: white and filled: " + this.filled);
        
    }
}