package course2.transport;

public class Train {}
//public class Train extends Transport {
//    private double tripPrice;
//    private int tripTime;
//    private String departureStationName;
//    private String finalStop;
//    private int numberOfCars;
//
//    public Train(String brand, String model, String color, int year, String country, double maxSpeed,
//                 double tripPrice, int tripTime, String departureStationName,
//                 String finalStop, int numberOfCars) {
//        super(brand, model, color, year, country, maxSpeed);
//        this.tripPrice = validateDoubleValue(tripPrice);
//        this.tripTime = validateIntValue(tripTime);
//        this.departureStationName = validateStringValue(departureStationName);
//        this.finalStop = validateStringValue(finalStop);
//        this.numberOfCars = validateIntValue(numberOfCars);
//    }
//    @Override
//    public String refill() {
//        setFuel("дизель");
//        return "Топливо для заправки:" + getFuel();
//    }
//    @Override
//    public String toString() {
//        return "Поезд  «" + getBrand() + "», модель " + getModel() + ", " + getYear() + " год выпуска в стране: "
//                + getCountry() + ", скорость передвижения — " + getMaxSpeed() + " км/ч, отходит от станции: "
//                + getDepartureStationName() + " и следует до станции " + getFinalStop() + ". Цена поездки — "
//                + getTripPrice() + " рублей, в поезде " + getNumberOfCars() + " вагонов." + " " + refill();
//    }
//    public double getTripPrice() {
//        return tripPrice;
//    }
//    public int getTripTime() {
//        return tripTime;
//    }
//    public String getDepartureStationName() {
//        return departureStationName;
//    }
//    public String getFinalStop() {
//        return finalStop;
//    }
//    public int getNumberOfCars() {
//        return numberOfCars;
//    }
//
//    public void setTripPrice(double tripPrice) {
//        this.tripPrice = validateDoubleValue(tripPrice);
//    }
//    public void setTripTime(int tripTime) {
//        this.tripTime = validateIntValue(tripTime);
//    }
//    public void setDepartureStationName(String departureStationName) {
//        this.departureStationName = validateStringValue(departureStationName);
//    }
//    public void setFinalStop(String finalStop) {
//        this.finalStop = validateStringValue(finalStop);
//    }
//    public void setNumberOfCars(int numberOfCars) {
//        this.numberOfCars = validateIntValue(numberOfCars);
//    }
//}
