package demoInterfeteComparableSiComparator;

public class TennisPlayer  implements Comparable<TennisPlayer> {
    private String name;
    private int ranking;
    private boolean vaccinated;

    public int getRanking() {
        return ranking;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public TennisPlayer(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return name+" - "+ranking+"   isVaccinated:"+vaccinated;
    }

    @Override
    public int compareTo(TennisPlayer tp1) {
        return Integer.compare(this.ranking, tp1.ranking);
    }
}
