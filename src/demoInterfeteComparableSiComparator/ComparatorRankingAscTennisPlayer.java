package demoInterfeteComparableSiComparator;

import java.util.Comparator;

public class ComparatorRankingAscTennisPlayer implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer tp1, TennisPlayer tp2) {
        return Integer.compare(tp1.getRanking(), tp2.getRanking());

    }
}
