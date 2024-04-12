import java.util.List;

public class ExampleNullSafety {

    public String getAlternatives(Ecosystem ecosystem) {
        Alternatives alternatives = ecosystem.getAlternatives();
        if (alternatives == null) {
            return null;
        }

        List<Proposition> propositionList = alternatives.getPropositions();
        if (propositionList == null || propositionList.isEmpty()) {
            return null;
        }

        Proposition firstProposition = propositionList.get(0);
        if (firstProposition == null) {
            return null;
        }

        Value valueHolder = firstProposition.getValue();
        if (valueHolder == null) {
            return null;
        }

        return valueHolder.getValue();
    }

}




































































































class Test {
    static void test() { var foo = new ExampleNullSafety().getAlternatives(new Ecosystem()); }
}





