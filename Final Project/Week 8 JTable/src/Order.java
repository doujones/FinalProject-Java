/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doujones
 */
public class Order {
    // attributes
    private String customerName;
    private String customerAddress;
    private String flooringType;
    private double floorLength;
    private double floorWidth;
    private double floorCost;
    
    // constructors

    public Order() {
    customerName = "unknown";
    customerAddress = "unknown";
    flooringType = "unknown";
    floorLength = 0.0;
    floorWidth = 0.0;
    floorCost = 0.0;
    }

    public Order(String customerName, String customerAddress, String flooringType, 
        double floorLength, double floorWidth, double flooringCost) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.flooringType = flooringType;
        this.floorLength = floorLength;
        this.floorWidth = floorWidth;
        this.floorCost = floorCost;
    }

    @Override
    public String toString() {
        return "Order{" + "customerName = " + customerName + ", customerAddress=" + customerAddress + ", flooringType=" + flooringType + ", floorLength=" + floorLength + ", floorWidth=" + floorWidth + ", floorCost=" + floorCost + '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }

    public double getFloorLength() {
        return floorLength;
    }

    public void setFloorLength(double floorLength) {
        this.floorLength = floorLength;
    }

    public double getFloorWidth() {
        return floorWidth;
    }

    public void setFloorWidth(double floorWidth) {
        this.floorWidth = floorWidth;
    }

    public double getFloorCost() {
        return floorCost;
    }

    public void setFloorCost(double flooringCost) {
        this.floorCost = floorCost;
    }
    
}
