package com.SpringCrud.SpringApp.DTO;

public class CustUpdateDTO{

    private int custid;

    private String custname;

    private int phone;

    public CustUpdateDTO() {
    }

    public CustUpdateDTO(int custid, String custname, int phone) {
        this.custid = custid;
        this.custname = custname;
        this.phone = phone;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustDTO{" +
                "custid=" + custid +
                ", custname='" + custname + '\'' +
                ", phone=" + phone +
                '}';
    }
}
