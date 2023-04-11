package ss6_inheritance.exercise.point2dandpoint3d.point3d;

import ss6_inheritance.exercise.point2dandpoint3d.point2d.Point2d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(getX());
        super.setY(getY());
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr2 = {getX(), getY(), getZ()};
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
