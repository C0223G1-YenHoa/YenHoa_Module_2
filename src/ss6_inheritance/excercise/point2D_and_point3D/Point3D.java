package ss6_inheritance.excercise.point2D_and_point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] setXYZ(float x, float y, float z) {
        float[] array = {this.getX(), this.getY(), this.getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D (" +
                getX() +
                "," +
                getY() +
                "," +
                getZ() +
                ')';
    }
}
