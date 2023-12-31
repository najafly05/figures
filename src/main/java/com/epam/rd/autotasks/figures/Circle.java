package com.epam.rd.autotasks.figures;
class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        double leftX = center.getX() - radius;
        Point leftmostPoint = new Point(leftX, center.getY());
        return leftmostPoint;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }
}
