package com.driver.EntryDto;


import com.driver.model.Station;

public class SeatAvailabilityEntryDto {

    private int trainId;


    private Station fromStation;

    private Station toStation;
    //private int noOfBookingSeat;

    public SeatAvailabilityEntryDto() {
    }

    public SeatAvailabilityEntryDto(int trainId, Station fromStation, Station toStation) {
        this.trainId = trainId;
        this.fromStation = fromStation;
        this.toStation = toStation;
//        this.noOfBookingSeat = noOfBookingSeat;
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

}
