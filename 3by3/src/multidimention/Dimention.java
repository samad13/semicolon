package multidimention;
import java.util.Arrays;
public class Dimention {


    public String [][] getResult(int[][] boy) {
        String[][] res = new String[boy.length][boy.length];
        for (int count = 0; count < boy.length; count++) {
            for (int index = 0; index < boy.length; index++) {
               if(boy[count][index] == 1){
                   res[count][index]= "*";

               }
               else if(boy[count][index] == 0){
                   res[count][index]=" ";
               }
            }
        }
        return  res;
    }
}

