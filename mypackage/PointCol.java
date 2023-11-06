package mypackage;

public class PointCol extends Point{

    private byte couleur;

    public void colorer(byte couleur){
        this.couleur = couleur;
    }

    public class afficheCol(){
        this.affiche();
        System.out.println("de couleur "+this.couleur);
    }
}