package com.yinhai.myws.entity;

public class Student {
    private int id;
    private String name;
    private float price;
    public int getId() {
        return id;
    }
    
    
    public Student() {
        
        // TODO Auto-generated constructor stub
    }


    public Student(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    
    
}
