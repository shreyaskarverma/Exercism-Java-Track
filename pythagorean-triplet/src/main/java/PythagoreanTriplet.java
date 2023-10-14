import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    public static class PythagoreanTripletBuilder {
        private int tripletsSum;
        private int limit;

        public PythagoreanTripletBuilder thatSumTo(int tripletsSum) {
            this.tripletsSum = tripletsSum;
            return this;
        }

        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a < tripletsSum; a++) {
                int equationVariable1 = tripletsSum * tripletsSum - 2 * tripletsSum * a;
                int equationVariable2 = 2 * tripletsSum - 2 * a;
                if (equationVariable1 % equationVariable2 == 0) {
                    int b = equationVariable1 / equationVariable2;
                    int c = tripletsSum - a - b;
                    if (a < b && b < c && (limit == 0 || a <= limit && b <= limit && c <= limit)) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return triplets;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PythagoreanTriplet) {
            PythagoreanTriplet p = (PythagoreanTriplet) obj;
            return a == p.a && b == p.b && c == p.c;
        }
        return false;
    }
}
