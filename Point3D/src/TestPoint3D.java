public class TestPoint3D //Test
{
       /* method that calculates and displays the maximum distance between two points in the given arrays and the points with the maximum distance*/
       public static void max(Point3D points[])
       {
         double maxDist = 0;

             Point3D point1 =null, point2= null;

             for(int i=0;i<points.length;i++)
             {
                    for(int j=i+1;j<points.length;j++)
                    {
                           double dist = points[i].distance(points[j]);
                           if( dist > maxDist)
                           {
                                 point1 = points[i];

                                 point2 = points[j];

                                 maxDist = dist;
                           }
                    }
             }

 
             if(point1 != null && point2 != null)

             {

                    System.out.println("Maximum distance : "+maxDist+" between points ("+point1.getX()+", "+point1.getY()+", "+point1.getZ()+") and "

                                 +" ("+point2.getX()+", "+point2.getY()+", "+point2.getZ()+")");

             }

       }

      

       /* method that calculates and displays the minimum distance between two points in the given arrays and the points with the minimum distance*/

       public static void min(Point3D points[])

       {
             double minDist = Double.MAX_VALUE;

             Point3D point1 =null, point2= null;

             for(int i=0;i<points.length;i++)

             {
                    for(int j=i+1;j<points.length;j++)
                    {
                           double dist = points[i].distance(points[j]);
                           if( dist < minDist)
                           {
                                 point1 = points[i];

                                 point2 = points[j];

                                 minDist = dist;
                           }
                    }
             }

            

             if(point1 != null && point2 != null)

             {

                    System.out.println("Minimum distance : "+minDist+" between points ("+point1.getX()+", "+point1.getY()+", "+point1.getZ()+") and "

                                 +" ("+point2.getX()+", "+point2.getY()+", "+point2.getZ()+")");

             }

       }

      

       public static void main(String[] args) {

             Point3D point1 = new Point3D();

             Point3D point2 = new Point3D(2,3,1,"Yellow");

             
             System.out.println("Point1 : ("+point1.getX()+","+point1.getY()+","+point1.getZ()+") Color : "+point1.getColour());

             System.out.println("Point2 : ("+point2.getX()+","+point2.getY()+","+point2.getZ()+") Color : "+point2.getColour());

            

             Point3D points[] = {new Point3D(),new Point3D(1,2,3,"Red"),new Point3D(5,1,3,"Yellow"),
               new Point3D(8.5,1.24,4,"Blue"),new Point3D(1.5,2,7.5,"Green"),new Point3D(12,5.5,8,"Magenta"),
               new Point3D(8,2.4,3.25,"Cyan"),new Point3D(9,12,8,"Purple"),new Point3D(8,0.5,12,"Pink"),
               new Point3D(0,13.6,7.5,"Orange")};

             max(points);

             min(points);
 
       }

}

//end of TestPoint3D.java