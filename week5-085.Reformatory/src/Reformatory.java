
public class Reformatory {

    private int weightCounter = 0;

    public int weight(Person person) {
        // return the weight of the person
        weightCounter++;
        return person.getWeight();

    }

    public void feed(Person person) {

        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);

    }

    public int totalWeightsMeasured() {
        return weightCounter;

    }

}
