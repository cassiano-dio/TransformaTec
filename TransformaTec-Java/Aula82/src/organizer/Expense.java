package organizer;

public class Expense {

    private int id;
    private String name;
    private Double amount;
    private String expireDate;
    private String category;

    public Expense(int id, String name, Double amount, String category, String expireDate) {

        this.id = id;
        this.name = name;
        this.amount = amount;
        this.expireDate = expireDate;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate){
        this.expireDate = expireDate;
    }
}
