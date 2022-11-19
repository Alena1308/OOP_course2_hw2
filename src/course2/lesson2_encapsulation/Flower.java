package course2.lesson2_encapsulation;

public class Flower {
    private String name;
    private String flowerColor = "Белый";
    private String country = "Россия";
    private double cost;
    private int lifeSpan = 3;
    //    Flower (String name, String flowerColor, String country, double cost, int lifeSpan) {
//        if (name == null || name.isEmpty() || name.isBlank()) {
//            this.name = "Не указано";
//        } else {
//            this.name = name;
//        }
//        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
//            this.flowerColor = "Белый";
//        } else {
//            this.flowerColor = flowerColor;
//        }
//        if (country == null || country.isEmpty() || country.isBlank()) {
//            this.country = "Россия";
//        } else {
//            this.country = country;
//        }
//        if (cost <= 0) {
//            this.cost = 1;
//        } else {
//            this.cost = cost;
//        }
//        if (lifeSpan < 0) {
//            this.lifeSpan = Math.abs(lifeSpan);
//        } else if (lifeSpan == 0) {
//            this.lifeSpan = 3;
//        } else {
//            this.lifeSpan = lifeSpan;
//        }
//    }
    @Override
    public String toString() {
        return "Название: " + name + ", страна происхождения: " + country +
                ", стоимость: " + String.format("%.2f", cost) + ", срок стояния цветка: " + lifeSpan;
    }
    public String getName() {
        return name;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public String getCountry() {
        return country;
    }
    public double getCost() {
        return cost;
    }
    public int getLifeSpan() {
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else {
            this.lifeSpan = lifeSpan;
        }
        return lifeSpan;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Не указано";
        } else {
            this.name = name;
        }
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
}
