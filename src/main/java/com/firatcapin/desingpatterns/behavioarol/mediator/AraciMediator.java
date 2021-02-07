package com.firatcapin.desingpatterns.behavioarol.mediator;

public interface AraciMediator {
    void ureticiEkle(Uretici uretici);
    void pazarEkle(Pazarci pazarci);
    void ureticidenAl(Uretici uretici);
    void pazarciyaSat(Pazarci pazarci);
}
