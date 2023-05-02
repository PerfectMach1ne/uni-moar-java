import java.util.Objects;

public class Point {
    private float wspX, wspY;

    public Point() {}

    public Point(float wspX, float wspY) {
        this.wspX = wspX;
        this.wspY = wspY;
    }

    public float getWspX() {
        return wspX;
    }

    public void setWspX(float wspX) {
        this.wspX = wspX;
    }

    public float getWspY() {
        return wspY;
    }

    public void setWspY(float wspY) {
        this.wspY = wspY;
    }

    @Override
    public String toString() {
        return "Punkt P(" + this.wspX + ", " + this.wspY + ")" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( !(o instanceof Point) ) return false;
        Point point = (Point)o;
        return Float.compare(point.wspX, wspX) == 0 && Float.compare(point.wspY, wspY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wspX, wspY);
    }

    public double distanceToPoint(Point point) {
        return Math.sqrt(Math.pow(this.wspX - point.getWspX(), 2) + Math.pow(this.wspY - point.getWspY(), 2));
    }

    public int checkQuadrant(Point point) {
        if (Math.signum(point.getWspX()) == 0 || Math.signum(point.getWspY()) == 0) {
            return 0;   // Punkt jest na jednej z osi - czyli na żadnej z ćwiartek
        } else if (Math.signum(point.getWspX()) == 1) {
            if (Math.signum(point.getWspY()) == 1) {
                return 1;   // x > 0 i y > 0 => 1 ćwiartka
            }
            return 4;   // x > 0 i y < 0 => 4 ćwiartka
        }
        if (Math.signum(point.getWspY()) == 1) {
            return 3;   // x < 0 i y > 0 => 3 ćwiartka
        }
        return 2;   // x < 0 i y < 0 => 2 ćwiartka
    }

    public void vectorTranslation(float shiftX, float shiftY) {     // Przesuwa o wektor [shiftX, shiftY]
        this.wspX += shiftX;
        this.wspY += shiftY;
    }
}
