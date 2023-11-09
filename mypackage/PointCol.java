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
        super.affiche();
        System.out.println("de couleur "+this.couleur);
    }
}