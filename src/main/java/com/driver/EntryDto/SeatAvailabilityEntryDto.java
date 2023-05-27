package com.driver.EntryDto;


import com.driver.model.Station;

public class SeatAvailabilityEntryDto {

    private int trainId;


    private Station fromStation;

    private Station toStation;
    private int noOfBookingSeat;

    public SeatAvailabilityEntryDto() {
    }

    public SeatAvailabilityEntryDto(int trainId, Station fromStation, Station toStation, int noOfBookingSeat) {
        this.trainId = trainId;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.noOfBookingSeat = noOfBookingSeat;
    }



    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }


    public Station getFromStation() {
        return fromStation;
    }

    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void setToStation(Station toStation) {
        this.toStation = toStation;
    }

    public int getNoOfBookingSeat() {
        return noOfBookingSeat;
    }

    public void setNoOfBookingSeat(int noOfBookingSeat) {
        this.noOfBookingSeat = noOfBookingSeat;
    }
}
