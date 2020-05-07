package com.github.mohistzh.oo.parking.pojo;

import java.io.Serializable;

/**
 * Common users
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class Person implements Serializable {
    /**
     * Full name
     */
    private String name;
    /**
     * Address reference
     */
    private Address address;
    /**
     * Email
     */
    private String email;
    /**
     * Cell-phone number
     */
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
