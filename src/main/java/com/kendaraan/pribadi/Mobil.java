package com.kendaraan.pribadi;

import com.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    @Override
    public void Start(){
        System.out.println("Mobil " + this.getName() + " dinyalakan");
    }
    @Override
    public void Stop(){
        System.out.println("Mobil " + this.getName() + " dimatikan");
    }
    @Override
    public void Brake(){
        System.out.println("Mobil " + this.getName() + " berhenti");
    }
}