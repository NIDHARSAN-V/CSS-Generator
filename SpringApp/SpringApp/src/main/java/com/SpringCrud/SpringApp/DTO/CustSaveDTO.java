package com.SpringCrud.SpringApp.DTO;

public class CustSaveDTO {



    private String custname;

    private int phone;

    public CustSaveDTO() {
    }

    public CustSaveDTO( String custname, int phone) {

        this.custname = custname;
        this.phone = phone;
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
                ", custname='" + custname + '\'' +
                ", phone=" + phone +
                '}';
    }
}
