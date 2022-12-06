package course2.transport;

public enum Capacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);
    private final int lowerLimit;
    private final int upperLimit;

    Capacity(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    @Override
    public String toString() {
        if (lowerLimit == 0) {
            return "Вместимость: до " + upperLimit + " мест";
        } else {
            return "Вместимость: oт " + lowerLimit + " до " + upperLimit + " мест";
        }
    }

    public int getLowerLimit() {
        return lowerLimit;
    }
    public int getUpperLimit() {
        return upperLimit;
    }
}
