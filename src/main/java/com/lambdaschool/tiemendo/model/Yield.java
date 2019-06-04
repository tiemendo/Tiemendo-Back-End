package com.lambdaschool.tiemendo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="yield")
public class Yield {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    Number of bags of crops (maize or sorghum) harvested
    private int numBags;

    @ManyToOne
    @JoinColumn(name="crop_id")
    @JsonIgnoreProperties("yields")
    private CropType cropType;

//    Their goal for bags of crops to sell
    private int goal;
//    Farm size in acres
    private int farmAcres;
//    Year or season
    private String season;

    @ManyToOne
    @JoinColumn(name="farmer_id")
    private Farmer farmer;

    public Yield() {
    }

    public Yield(int numBags, CropType cropType, int goal, int farmAcres, String season, Farmer farmer) {
        this.numBags = numBags;
        this.cropType = cropType;
        this.goal = goal;
        this.farmAcres = farmAcres;
        this.season = season;
        this.farmer = farmer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumBags() {
        return numBags;
    }

    public void setNumBags(int numBags) {
        this.numBags = numBags;
    }

    public CropType getCropType() {
        return cropType;
    }

    public void setCropType(CropType cropType) {
        this.cropType = cropType;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getFarmAcres() {
        return farmAcres;
    }

    public void setFarmAcres(int farmAcres) {
        this.farmAcres = farmAcres;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
}
