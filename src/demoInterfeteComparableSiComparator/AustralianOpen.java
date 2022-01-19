package demoInterfeteComparableSiComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AustralianOpen {

    public static void main(String[] args) {

   TennisPlayer tp1 = new TennisPlayer("nadal", 3);
        TennisPlayer tp2 = new TennisPlayer("federer", 4);
        TennisPlayer tp3 = new TennisPlayer("djokovic", 1);
        TennisPlayer tp4 = new TennisPlayer("medvedev", 2);

        List<TennisPlayer> listAustralia = new ArrayList<>();
        listAustralia.add(tp1);
        listAustralia.add(tp2);
        listAustralia.add(tp3);
        listAustralia.add(tp4);

        tp1.setVaccinated(true);
        tp2.setVaccinated(true);
        tp3.setVaccinated(true);

//        Collections.sort(listAustralia);
//
//
//        for(TennisPlayer player: listAustralia) {
//            System.out.println(player);
//        }

        ComparatorVaccinatedFirstTennisPlayer compVaccinated = new ComparatorVaccinatedFirstTennisPlayer();
        Collections.sort(listAustralia, compVaccinated);
        for(TennisPlayer player: listAustralia) {
           System.out.println(player);
        }

        System.out.println("-----------------------------");
        ComparatorRankingAscTennisPlayer compRankingDesc = new ComparatorRankingAscTennisPlayer();
        Collections.sort(listAustralia, compRankingDesc);
        for(TennisPlayer player: listAustralia) {
            System.out.println(player);
        }

    }
}
