package edu.cs.birzeit.final_android;

public class Apartment {
    private int id;
    private String location;
    private double price;
    private String ApartmentSpace;
    private int imageResource; //locally
    private String phoneNumber;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Apartment(int id, String location, double price, String apartmentSpace, int imageResource, String phoneNumber) {
        this.id = id;
        this.location = location;
        this.price = price;
        ApartmentSpace = apartmentSpace;
        this.imageResource = imageResource;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getApartmentSpace() {
        return ApartmentSpace;
    }

    public void setApartmentSpace(String apartmentSpace) {
        ApartmentSpace = apartmentSpace;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

}
