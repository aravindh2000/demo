package data;

import java.math.BigDecimal;
import java.util.List;

public class CollectedUserData {


    String nameOfUser;
    int id;
    List<String> choices;
    BigDecimal amount;

    public String getNameOfUser() {
        return nameOfUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CollectedUserData() {

    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    @Override
    public String toString() {
        return "CollectedUserData{" +
                "nameOfUser='" + nameOfUser + '\'' +
                ", id=" + id +
                ", choices=" + choices +
                ", amount=" + amount +
                '}';
    }
}
