package mypackage;

public class PointCol extends Point{

    private byte couleur;

    public PointCol(int abs,int ord,byte col){
        super(abs,ord);
        this.colorer(col);
    }
    public void colorer(byte couleur){
        this.couleur = couleur;
    }

    public void affiche(){
        System.out.println("Je suis un point de coordonnees "+this.abs + " et " + this.ord+" de couleur "+this.couleur);
    }
}