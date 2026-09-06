package LibraryFunction;
import packageCircle.BGhelperPackage;
import java.util.ArrayList;

public class GeneralCircle_BgLibrary {
    public static void main(String[] args) {
        int radius=BGhelperPackage.getRadius();
        ArrayList<int[]> gyawali=new ArrayList<>();

        System.out.println("\nCalculated Points With Bikram:");
    

        for(int suru=0;suru<=radius;suru++) {
            int antim=(int)Math.round(Math.sqrt(radius*radius-suru*suru));

            int[][] butwal={
                {suru,antim},
                {-suru,antim},
                {suru,-antim},
                {-suru,-antim}
            };

            for(int[] ashli:butwal) {
                System.out.println("(" + ashli[0] + "," + ashli[1] + ")");
                gyawali.add(ashli);
            }
        }

        System.out.println("Circle drawing completed.");

        int[][] bghehe=new int[gyawali.size()][2];

        for(int suru=0;suru<gyawali.size();suru++) {
            bghehe[suru]=gyawali.get(suru);
        }

        BGhelperPackage.showCircle(bghehe,"General Circle Drawing With Bikram - Library");
    }
}