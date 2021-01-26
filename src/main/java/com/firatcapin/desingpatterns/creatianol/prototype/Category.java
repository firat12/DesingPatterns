package com.firatcapin.desingpatterns.creatianol.prototype;

public class Category implements Cloneable{
    private Long id;
    private String  adi;

    public Category() {}

    @Override
    protected Category clone() throws CloneNotSupportedException {
        return (Category) super.clone();
    }

    @Override
    public String toString() {
        return "Category{" +
                "adi='" + adi + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
