public class Point3D //Point3D.java
{
  private double x;// instance variables  
  private double y;  
  private double z;
  private String colour;
  
  
  public Point3D()       // constructors
    
  { x = 0;   y = 0; z = 0; colour = "Red";}
  
  public Point3D(double x, double y, double z, String colour)
    
  {
    this.x = x;    
    this.y = y;  
    this.z = z;  
    this.colour = colour;
  }
  
  
  public double getX()// get methods
  {return x;}      
  public double getY()
  {return y;} 
  public double getZ()
  {return z;}   
  public String getColour()
  {return colour; }
  
  
  
  public double distance(Point3D point)       // distance methods
  {
    return(Math.sqrt(Math.pow(x-point.x,2)+Math.pow(y-point.y, 2)+Math.pow(z-point.z, 2)));
  }
  
  public double distance(double x, double y, double z)
  {
    return(Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2)+Math.pow(this.z-z, 2)));
  }
}//end