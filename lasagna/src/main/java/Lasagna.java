public class Lasagna {
    private final int EXPECTED_MINUTES=40;
    private final int TIME_FOR_PREPARING_EACH_LAYER=2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return EXPECTED_MINUTES;//extract it into a variable
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeSpent)
    {
        return (expectedMinutesInOven()-timeSpent);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers)
    {
        return (TIME_FOR_PREPARING_EACH_LAYER * layers);//extract into a variable
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeSpent)
    {
        return (preparationTimeInMinutes(layers) + timeSpent);
    }
}
