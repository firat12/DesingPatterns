package com.firatcapin.desingpatterns.creatianol.prototype;

public class File implements Cloneable{
    private Long id;
    private String name;
    private FileType fileType;
    private Category category;
    private String data;

    public File(){}

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

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "File{" +
                "\nid=" + id +
                ",\nname='" + name + '\'' +
                ",\nfileType=" + fileType +
                ",\ncategory=" + category +
                ",\ndata='" + data + '\'' +
                '}';
    }

    /**
     * Shallow clone (Yüzeysel klonlama)
     * @return
     * @throws CloneNotSupportedException
     */
   /* @Override
    protected File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }*/

    /**
     * Shallow clone (Yüzeysel klonlama)
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected File clone() throws CloneNotSupportedException {
        File file = (File) super.clone();
        FileType fileType = file.fileType.clone();
        Category category = file.category.clone();
        file.setCategory(category);
        file.setFileType(fileType);
        return file;
    }
}
