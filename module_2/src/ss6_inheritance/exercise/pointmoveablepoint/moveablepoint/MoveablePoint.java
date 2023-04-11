package ss6_inheritance.exercise.pointmoveablepoint.moveablepoint;

import ss6_inheritance.exercise.pointmoveablepoint.point2d.Point2d;

public class MoveablePoint extends Point2d {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {getXSpeed(), getYSpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return
                "x= " + super.getX() +
                ", y= " + super.getY() +
                ", xspeed=" + xSpeed +
                ", yspeed=" + ySpeed ;
    }

    public MoveablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
