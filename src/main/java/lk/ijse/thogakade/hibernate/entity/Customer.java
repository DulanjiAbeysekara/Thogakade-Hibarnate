package lk.ijse.thogakade.hibernate.entity;

import javax.persistence.*;


@Entity
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "customer_name")
    private String name;

    @Column(name ="mobile_number" )
    private  String mobileNumber;


    public Customer() {
    }

    public Customer(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.mobileNumber = number;

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

    public String getNumber() {
        return mobileNumber;
    }

    public void setNumber(String number) {
        this.mobileNumber = number;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
