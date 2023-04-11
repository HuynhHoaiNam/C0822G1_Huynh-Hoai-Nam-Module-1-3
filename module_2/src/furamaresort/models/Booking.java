package furamaresort.models;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private LocalDate startDay;
    private LocalDate endDate;
    private String custumerId;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingId, LocalDate startDay, LocalDate endDate,
                   String custumerId, String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDate = endDate;
        this.custumerId = custumerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(String custumerId) {
        this.custumerId = custumerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", custumerId='" + custumerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
    public String getInfoBooking() {
        return String.format("%s,%s,%s,%s,%s,%s",getBookingId(),getStartDay(),getEndDate(),getCustumerId(),getServiceName(),getServiceType());
    }
}
