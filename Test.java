import mypackage.*;
import java.util.Random;
public class Test{
    
    public static void main(String[] args){
        Random rand = new Random();
        Point points[] = new Point[10];
        for (int i = 0; i < 10; i++)
            if(rand.nextInt()%2 == 0)
                points[i] = new Point(rand.nextInt(),rand.nextInt());
            else
                points[i] = new PointCol(rand.nextInt(),rand.nextInt(),(byte)rand.nextInt(100));

        for(int i = 0; i < 10; i++)
            points[i].affiche();  
    }
}