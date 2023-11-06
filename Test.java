import mypackage.*;

public class Test{
    
    public static void main(String[] args){

        PointCol point;

        point = new PointCol(5,5,(byte)125);
        System.out.println("test heritage de la methode afficher sur pointcol");
        point.affiche();
        System.out.println("test heritage de la methode afficherCol sur pointcol");
        point.afficheCol();
        System.out.println("test heritage de la methode deplacer sur pointcol");
        point.deplacer(9,6);
        point.afficheCol();
    }
}