package com.github.mohistzh.oo.parking.pojo;

import com.github.mohistzh.oo.parking.pojo.constant.ParkingTicketStatus;

import java.io.Serializable;
import java.util.Date;

/**
 * Parking ticket
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class ParkingTicket implements Serializable {
    private String ticketNumber;
    private Date issuedAt;
    private Date payedAt;
    private double payedAmount;
    private ParkingTicketStatus ticketStatus;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(Date payedAt) {
        this.payedAt = payedAt;
    }

    public double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public ParkingTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(ParkingTicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
