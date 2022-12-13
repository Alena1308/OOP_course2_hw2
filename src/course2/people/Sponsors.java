package course2.people;

public class Sponsors {
    private String name;
    private int money;

    public Sponsors(String name, int money) {
        this.name = validateStringValue(name);
        this.money = validateIntValue(money);
    }
    public void sponsorTheRace(){
        System.out.println("Спонсировать заезд на сумму " + getMoney());
    }
    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "default";
        } else {
            return value;
        }
    }
    public int validateIntValue (int value) {
        if (value <= 0) {
            return 0;
        } else  {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateStringValue(name);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = validateIntValue(money);
    }
}
