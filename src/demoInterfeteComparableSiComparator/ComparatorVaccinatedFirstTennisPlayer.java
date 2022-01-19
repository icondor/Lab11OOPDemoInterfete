package demoInterfeteComparableSiComparator;

import java.util.Comparator;

public class ComparatorVaccinatedFirstTennisPlayer implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer tp1, TennisPlayer tp2) {
        return Boolean.compare( tp2.isVaccinated(), tp1.isVaccinated());

    }
}
