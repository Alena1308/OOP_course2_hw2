package course2.transport;

public enum LoadCapacity {
    N1(0D, 3.5), N2(3.5, 12D), N3(12D, null);

    private final Double lowerLimit;
    private final Double upperLimit;

    LoadCapacity(Double lowerLimit, Double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    @Override
    public String toString() {
        if (lowerLimit == null || lowerLimit == 0) {
            return "Грузоподъемность: до " + upperLimit + " тонн";
        }
        if (upperLimit == null) {
            return "Грузоподъемность: от " + lowerLimit + " тонн";
        } else {
            return "Грузоподъемность: oт " + lowerLimit + " до " + upperLimit + " тонн";
        }
    }

    public Double getLowerLimit() {
        return lowerLimit;
    }
    public Double getUpperLimit() {
        return upperLimit;
    }
}
