package com.github.binarySmile.petstoreswagger.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class InventoryResponse {

    @JsonProperty("sold")
    private int sold;

    @JsonProperty("unavailable")
    private int unavailable;

    @JsonProperty("Nonavailable")
    private int nonavailable;

    @JsonProperty("pending")
    private int pending;

    @JsonProperty("testing")
    private int testing;

    @JsonProperty("available")
    private int available;

    @JsonProperty("asdasda")
    private int asdasda;

    @JsonProperty("Not Found")
    private int notFound;

    @JsonProperty("swimming")
    private int swimming;

    @JsonProperty("Active")
    private int active;

    @JsonProperty("decasead")
    private int decasead;

    @JsonProperty("amet")
    private int amet;

    @JsonProperty("ok")
    private int ok;

    @JsonProperty("consectetur")
    private int consectetur;

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(int unavailable) {
        this.unavailable = unavailable;
    }

    public int getNonavailable() {
        return nonavailable;
    }

    public void setNonavailable(int nonavailable) {
        this.nonavailable = nonavailable;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getTesting() {
        return testing;
    }

    public void setTesting(int testing) {
        this.testing = testing;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getAsdasda() {
        return asdasda;
    }

    public void setAsdasda(int asdasda) {
        this.asdasda = asdasda;
    }

    public int getNotFound() {
        return notFound;
    }

    public void setNotFound(int notFound) {
        this.notFound = notFound;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getDecasead() {
        return decasead;
    }

    public void setDecasead(int decasead) {
        this.decasead = decasead;
    }

    public int getAmet() {
        return amet;
    }

    public void setAmet(int amet) {
        this.amet = amet;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public int getConsectetur() {
        return consectetur;
    }

    public void setConsectetur(int consectetur) {
        this.consectetur = consectetur;
    }

    @Override
    public String toString() {
        return
                "InventoryResponse{" +
                        "sold = '" + sold + '\'' +
                        ",unavailable = '" + unavailable + '\'' +
                        ",nonavailable = '" + nonavailable + '\'' +
                        ",pending = '" + pending + '\'' +
                        ",testing = '" + testing + '\'' +
                        ",available = '" + available + '\'' +
                        ",asdasda = '" + asdasda + '\'' +
                        ",not Found = '" + notFound + '\'' +
                        ",swimming = '" + swimming + '\'' +
                        ",active = '" + active + '\'' +
                        ",decasead = '" + decasead + '\'' +
                        ",amet = '" + amet + '\'' +
                        ",ok = '" + ok + '\'' +
                        ",consectetur = '" + consectetur + '\'' +
                        "}";
    }
}