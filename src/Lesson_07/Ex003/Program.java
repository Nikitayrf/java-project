package Lesson_07.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(0);
        var dis = Point2D.distance(a, b);
        System.out.println(dis);

        Point3D c = new Point3D(0);
        Point3D d = new Point3D(1,1,1);
        dis = Point3D.distance( c, d );
        System.out.println(dis);
    }
}
