package mypackage;

public class Point{

    private int abs;
    private int ord;
    
    public void initialiser(int abs, int ord){
        this.abs = abs;
        this.ord = ord;
    }

    public void deplacer(int x, int y){
        this.abs += x;
        this.ord += y;
    }

    public void affiche(){
        System.out.println("Je suis un point de coordonnees "+this.abs + " et " + this.ord);
    }

}