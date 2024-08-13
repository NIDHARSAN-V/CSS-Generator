package com.SpringCrud.SpringApp.Entity;


import jakarta.persistence.*;
@Entity
@Table(name = "customer")
public class Cust {



    //All columns and rows
    @Id
    @Column(name = "customer_id" , length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custid;

    @Column(name = "customer_name" , length = 50)
    private String custname;

    @Column(name = "customer_mobile" , length = 10)
    private int phone;

    public Cust(int custid, String custname, int phone) {
        this.custid = custid;
        this.custname = custname;
        this.phone = phone;
    }

    public Cust(String custname, int phone) {
      this.custname = custname;
      this.phone = phone;
    }

    public Cust() {

    }



    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "custid=" + custid +
                ", custname='" + custname + '\'' +
                ", phone=" + phone +
                '}';
    }
}
