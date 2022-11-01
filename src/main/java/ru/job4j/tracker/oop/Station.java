package ru.job4j.tracker.oop;

public class Station {
    public static void main(String[] args) {
        Vehicle fighterGet = new Airplane();
        Vehicle superGet = new Airplane();
        Vehicle attackAircraft = new Airplane();
        Vehicle rostovMoscow = new Train();
        Vehicle moscowMinsk = new Train();
        Vehicle minskAmsterdam = new Train();
        Vehicle route359 = new Bus();
        Vehicle route666 = new Bus();
        Vehicle route001 = new Bus();
        Vehicle[] vehicles = {fighterGet, superGet, attackAircraft, rostovMoscow,
        moscowMinsk, minskAmsterdam, route359, route666, route001};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.checkPassengers();
        }
    }
}
