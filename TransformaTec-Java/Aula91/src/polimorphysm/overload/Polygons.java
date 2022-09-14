package polimorphysm.overload;

class Polygon{

    public void perimeter(int a, int b, int c){
        System.out.println("Triangulo de perímetro: " + (a  + b + c));
    }

    public void perimeter(int a, int b, int c, int d){
        System.out.println("Quadrilatero de perímetro: " + (a  + b + c + d));
    }

    public void perimeter(int a, int b, int c, int d, int e){
        System.out.println("Pentagono de perímetro: " + (a  + b + c + d + e));
    }

}

public class Polygons {
    
    public static void main(String[] args) {
        
        Polygon polygon = new Polygon();

        polygon.perimeter(1, 2, 3);
        polygon.perimeter(1, 2, 3, 4);
        polygon.perimeter(1, 2, 3, 4 ,5);

    }
}
