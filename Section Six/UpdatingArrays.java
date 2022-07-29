import java.lang.reflect.Array;
import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menue = {"Espresso","Iced Coffee","Macchiato"};
        menue[2]="Latte";
        String menueString = Arrays.toString(menue);
        System.out.println(menueString);

        String[] newMenue = new String[5];
        for (int i=0; i<menue.length; i++){
            newMenue[i]=menue[i];
        }
        System.out.println(Arrays.toString(newMenue));
        newMenue[3]= "House Blend";
        newMenue[4]= "Dark Roast";
        System.out.println(Arrays.toString(newMenue));


    }
}
