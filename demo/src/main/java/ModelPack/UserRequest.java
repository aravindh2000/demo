package ModelPack;

import java.math.BigDecimal;
import java.util.List;

public class UserRequest {


    String userName;
    int id;
    List<String> choices;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    BigDecimal amount;

    public UserRequest(String userName, int id, List<String> choices, BigDecimal amount) {
        this.userName = userName;
        this.id = id;
        this.choices = choices;
        this.amount = amount;
    }





    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
