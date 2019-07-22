package com.gilxyj.yaml03.bean;

/**
 * @program: yaml03
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-22 23:52
 **/
public class Buyer {

    private String name;
    private String address;
    private Long price;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
