package com.firatcapin.desingpatterns.creatianol.prototype;

public class FileType implements Cloneable{
    private Long id;
    private String  name;

    public FileType(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected FileType clone() throws CloneNotSupportedException {
        return (FileType) super.clone();
    }

    @Override
    public String toString() {
        return "FileType{" +
                "name='" + name + '\'' +
                '}';
    }
}
