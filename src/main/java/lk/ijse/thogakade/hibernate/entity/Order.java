package lk.ijse.thogakade.hibernate.entity;


import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order id")
    private int id;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name ="description" )
    private  String description;

    @Column(name ="qty" )
    private  String qty;

    public Order() {
    }

    public Order(int id, String customerId, String description, String qty) {
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
        return "Order{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", description='" + description + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
