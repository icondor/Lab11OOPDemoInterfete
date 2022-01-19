import utility.InterMarker;
import utility.IonelUsefulOperations;
import utility.TitusUsefulOperations;
import utility.UsefulOperations;

public class HowIUseInterafacesMainClass {

    public static void main(String[] args) {
        HowIUseInterafacesMainClass o = new HowIUseInterafacesMainClass();

    }

    private void demo() {
        UsefulOperations uo;

        uo = new IonelUsefulOperations();

        uo.operation();
        uo.doSmth();
       UsefulOperations.staticDoSmth();

       metodaDemo(uo);




        TitusUsefulOperations tt = new TitusUsefulOperations();
        //tt.aLUiTitus(4,5);

    }


    private void metodaDemo(UsefulOperations uo) {
        uo.operation();
        if(uo instanceof InterMarker) {
            //fa ceva in plus
        }
        else
        {
            // fa altceva
        }
    }
}
