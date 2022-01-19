package demoInterfeteComparableSiComparator;

import java.util.Comparator;

public class ComparatorVaccinatedTennisPlayer implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer tp1, TennisPlayer tp2) {
        return Boolean.compare(tp1.isVaccinated(), tp2.isVaccinated());

    }
}
