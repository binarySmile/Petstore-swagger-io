package com.github.binarySmile.petstoreswagger.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class InventoryResponse{

	@JsonProperty("sold")
	private int sold;

	@JsonProperty("ksks")
	private int ksks;

	@JsonProperty("test")
	private int test;

	@JsonProperty("unavailable")
	private int unavailable;

	@JsonProperty("Nonavailable")
	private int nonavailable;

	@JsonProperty("pending")
	private int pending;

	@JsonProperty("available")
	private int available;

	@JsonProperty("asdasda")
	private int asdasda;

	@JsonProperty("Not Found")
	private int notFound;

	@JsonProperty("good")
	private int good;

	@JsonProperty("swimming")
	private int swimming;

	@JsonProperty("invalid_status")
	private int invalidStatus;

	@JsonProperty("amet")
	private int amet;

	@JsonProperty("{{petStatus}}")
	private int petStatus;

	@JsonProperty("consectetur")
	private int consectetur;

	@JsonProperty("Pending")
	private int pending1;

	public void setSold(int sold){
		this.sold = sold;
	}

	public int getSold(){
		return sold;
	}

	public void setKsks(int ksks){
		this.ksks = ksks;
	}

	public int getKsks(){
		return ksks;
	}

	public void setTest(int test){
		this.test = test;
	}

	public int getTest(){
		return test;
	}

	public void setUnavailable(int unavailable){
		this.unavailable = unavailable;
	}

	public int getUnavailable(){
		return unavailable;
	}

	public void setNonavailable(int nonavailable){
		this.nonavailable = nonavailable;
	}

	public int getNonavailable(){
		return nonavailable;
	}

	public void setPending1(int pending){
		this.pending = pending;
	}

	public int getPending1(){
		return pending;
	}

	public void setAvailable(int available){
		this.available = available;
	}

	public int getAvailable(){
		return available;
	}

	public void setAsdasda(int asdasda){
		this.asdasda = asdasda;
	}

	public int getAsdasda(){
		return asdasda;
	}

	public void setNotFound(int notFound){
		this.notFound = notFound;
	}

	public int getNotFound(){
		return notFound;
	}

	public void setGood(int good){
		this.good = good;
	}

	public int getGood(){
		return good;
	}

	public void setSwimming(int swimming){
		this.swimming = swimming;
	}

	public int getSwimming(){
		return swimming;
	}

	public void setInvalidStatus(int invalidStatus){
		this.invalidStatus = invalidStatus;
	}

	public int getInvalidStatus(){
		return invalidStatus;
	}

	public void setAmet(int amet){
		this.amet = amet;
	}

	public int getAmet(){
		return amet;
	}

	public void setPetStatus(int petStatus){
		this.petStatus = petStatus;
	}

	public int getPetStatus(){
		return petStatus;
	}

	public void setConsectetur(int consectetur){
		this.consectetur = consectetur;
	}

	public int getConsectetur(){
		return consectetur;
	}

	public void setPending(int pending){
		this.pending = pending;
	}

	public int getPending(){
		return pending;
	}

	@Override
 	public String toString(){
		return 
			"InventoryResponse{" + 
			"sold = '" + sold + '\'' + 
			",ksks = '" + ksks + '\'' + 
			",test = '" + test + '\'' + 
			",unavailable = '" + unavailable + '\'' + 
			",nonavailable = '" + nonavailable + '\'' + 
			",pending = '" + pending + '\'' + 
			",available = '" + available + '\'' + 
			",asdasda = '" + asdasda + '\'' + 
			",not Found = '" + notFound + '\'' + 
			",good = '" + good + '\'' + 
			",swimming = '" + swimming + '\'' + 
			",invalid_status = '" + invalidStatus + '\'' + 
			",amet = '" + amet + '\'' + 
			",{{petStatus}} = '" + petStatus + '\'' + 
			",consectetur = '" + consectetur + '\'' + 
			",pending = '" + pending1 + '\'' +
			"}";
		}
}