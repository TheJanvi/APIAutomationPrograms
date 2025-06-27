package com.restassuredproject.Ex_07_Payload_Management.Class.Manual_Approach.ResPayload;

import com.restassuredproject.Ex_07_Payload_Management.Class.Manual_Approach.ReqPayload.Booking;

public class BookingResponse {
    public Integer getGetBookingid() {
        return getBookingid;
    }

    public void setGetBookingid(Integer getBookingid) {
        this.getBookingid = getBookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Integer getBookingid;
    public Booking booking;
}
