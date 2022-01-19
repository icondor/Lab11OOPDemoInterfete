package demoInterfeteComparableSiComparator;

import java.util.Comparator;

public class ComparatorRankingDescTennisPlayer implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer tp1, TennisPlayer tp2) {
        return Integer.compare( tp2.getRanking(), tp1.getRanking());

    }
}
