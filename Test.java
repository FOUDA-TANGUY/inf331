import mypackage.*;

public class Test{
    
    public static void main(String[] args){

        Point point;
        point = new Point();

        point.initialiser(0,0);
        point.affiche();
        point.deplacer(9,6);
        point.affiche();
    }
}