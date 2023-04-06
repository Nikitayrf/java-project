package Lesson_07.Ex003;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(int value) {
        this(value, value, value);
    }

    public Point3D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format( "x: %d; y: %d; z: %d", x, y, z );
    }

    public static double distance(Point3D a, Point3D b) {
        return Math.sqrt( Math.pow( a.x - b.x, 2 ) + Math.pow( a.y - b.y, 2 ) + Math.pow(a.z - b.z, 2) );
    }
}
