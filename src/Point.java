public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceBetweenPoints(Point point){
        return Math.sqrt(Math.pow(point.getY() - this.y,2) + Math.pow(point.getX() - this.x,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }
}
