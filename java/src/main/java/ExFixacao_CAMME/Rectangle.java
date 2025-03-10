package ExFixacao_CAMME;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return(width*height);
    }

    public double Perimeter() {
        return((width*2) + (height*2));
    }

    public double Diagonal() {
        return(Math.sqrt((Math.pow(width, 2)) + Math.pow(height,2)));
    }
}
