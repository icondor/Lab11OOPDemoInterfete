package clasewrapper;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class DemoWrapper {

    public static void main(String[] args) {
        int i = 10;
        Integer I = i; // primitiv -> object, BOXING , AUTOBOXING
        int j = I;  // obiect -> primitiva, UNBOXING


        int o = 10;
        Integer valInt = Integer.valueOf(o);  // pe vremuri

        int intPrimitiv = valInt.intValue();  // pe vremuri, echiv cu linia 7



        /// casting nu e boxing
        // casting e de la primitiva la primitiva de tipuri diferite sau obiect la obiect

        int a =70000;
        double b = a;

        short s = (short)b; //sa fiu atent sa nu trec peste val maxima sau minima
        System.out.println(s);


    }

}
