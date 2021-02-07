package com.firatcapin.desingpatterns.behavioarol.strategy;

public class SayisalStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.FEN;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.SOSYAL;
    }
}
