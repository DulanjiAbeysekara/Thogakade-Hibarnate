package lk.ijse.thogakade.hibernate.dto;

public class OrderDTO {
    private int id;
    private String customerId;
    private  String description;
    private  String qty;

    public OrderDTO() {
    }

    public OrderDTO(int id, String customerId, String description, String qty) {
        this.id = id;
        this.customerId = customerId;
        this.description = description;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", description='" + description + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
