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
    private ParkingTicketStatus ticketStatus;
    private Date expired;

    public ParkingTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(ParkingTicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }
}
