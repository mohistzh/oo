package com.github.mohistzh.oo.parking.pojo;

import java.io.Serializable;

/**
 * Parking lot where is located in
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class Address implements Serializable {
    /**
     * Street address
     */
    private String streetAddress;
    /**
     * City
     */
    private String city;
    /**
     * State
     */
    private String state;
    /**
     * Zip code
     */
    private String zipCode;
    /**
     * Country
     */
    private String country;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
