package com.firatcapin.desingpatterns.creatianol.prototype;

public class GenericEntityService {
    public FileType findByFileTypeById(Long id){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        FileType fileType = new FileType();
        fileType.setId(id);
        if(id.compareTo(1L)==0){
           fileType.setName("Tür1");
        }
        else if(id.compareTo(2L)==0){
            fileType.setName("Tür2");
        }else{
            fileType.setName("Tür3");
        }

        return fileType;

    }

    public Category findByCategoryById(Long id){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);
        if(id.compareTo(1L)==0){
            category.setAdi("Category1");
        }
        else if(id.compareTo(2L)==0){
            category.setAdi("Category2");
        }else{
            category.setAdi("Category3");
        }

        return category;

    }

    public File findByFileById(Long id){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        File file = new File();
        file.setId(id);
        file.setFileType(findByFileTypeById(id));
        file.setCategory(findByCategoryById(id));

        if(id.compareTo(1L)==0){
            file.setName("Program Language");
            file.setData("Pyhton,Java,C#");
        }
        else if(id.compareTo(2L)==0){
            file.setName("Database Type");
            file.setData("Oracle,Mysql,C#");
        }else{
            file.setName("Program Language");
            file.setData("Pyhton,Java,C#");
        }

        return file;

    }
}
