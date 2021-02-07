package com.firatcapin.desingpatterns.behavioarol.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observableList;

    public Observable() {
        observableList = new ArrayList<>();
    }

    public void ekle(Observer observer){
        observableList.add(observer);
    }

    public void cikar(Observer observer){
        observableList.remove(observer);
    }

    public void haberVer(){
        for(Observer observer : observableList){
            observer.update(this);
        }
    }
}
