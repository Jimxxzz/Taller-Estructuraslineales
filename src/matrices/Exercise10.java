import java.util.ArrayList;
import java.util.Iterator;

class Match {
    String local;
    String visitor;
    int localScore;
    int visitorScore;

    Match(String l, String v, int ls, int vs) {
        local = l;
        visitor = v;
        localScore = ls;
        visitorScore = vs;
    }

    boolean isDraw() {
        return localScore == visitorScore;
    }

    boolean visitorWon() {
        return visitorScore > localScore;
    }

    boolean localWon() {
        return localScore > visitorScore;
    }

    @Override
    public String toString() {
        return local + " " + localScore + " - " + visitorScore + " " + visitor;
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<Match> matches = new ArrayList<>();
        // Add some sample matches
        matches.add(new Match("Barcelona", "Real Madrid", 2, 1));
        matches.add(new Match("Atletico", "Barcelona", 1, 3));
        matches.add(new Match("Valencia", "Sevilla", 1, 1));
        matches.add(new Match("Barcelona", "Valencia", 4, 0));
        matches.add(new Match("Sevilla", "Barcelona", 2, 2));

        // Show matches where visitor won
        System.out.println("Matches where visitor won:");
        for (Match m : matches) {
            if (m.visitorWon()) {
                System.out.println(m);
            }
        }

        // Count Barcelona wins
        int barcelonaWins = 0;
        for (Match m : matches) {
            if ((m.local.equals("Barcelona") && m.localWon()) || (m.visitor.equals("Barcelona") && m.visitorWon())) {
                barcelonaWins++;
            }
        }
        System.out.println("Barcelona wins: " + barcelonaWins);

        // Remove non-draws
        Iterator<Match> it = matches.iterator();
        while (it.hasNext()) {
            if (!it.next().isDraw()) {
                it.remove();
            }
        }
        System.out.println("Remaining matches (draws):");
        for (Match m : matches) {
            System.out.println(m);
        }

        // But wait, we removed them, so to count local wins, need original or recount
        // Since removed, perhaps add back or use original
        // For simplicity, assume we have the original list again
        matches.clear();
        matches.add(new Match("Barcelona", "Real Madrid", 2, 1));
        matches.add(new Match("Atletico", "Barcelona", 1, 3));
        matches.add(new Match("Valencia", "Sevilla", 1, 1));
        matches.add(new Match("Barcelona", "Valencia", 4, 0));
        matches.add(new Match("Sevilla", "Barcelona", 2, 2));

        int localWins = 0;
        for (Match m : matches) {
            if (m.localWon()) {
                localWins++;
            }
        }
        System.out.println("Local wins: " + localWins);
    }
}