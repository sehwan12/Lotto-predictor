package com.lotto_predictor.model;

import com.google.gson.annotations.SerializedName;

public class LotteryResult {

    @SerializedName("returnValue")
    private String returnValue;

    @SerializedName("drwNoDate")
    private String drwNoDate;

    @SerializedName("drwtNo1")
    private int drwtNo1;

    @SerializedName("drwtNo2")
    private int drwtNo2;

    @SerializedName("drwtNo3")
    private int drwtNo3;

    @SerializedName("drwtNo4")
    private int drwtNo4;

    @SerializedName("drwtNo5")
    private int drwtNo5;

    @SerializedName("drwtNo6")
    private int drwtNo6;

    @SerializedName("bnusNo")
    private int bnusNo;

    @SerializedName("totSellamnt")
    private long totSellamnt;

    @SerializedName("firstPrzwnerCo")
    private int firstPrzwnerCo;

    @SerializedName("firstWinamnt")
    private long firstWinamnt;

    @SerializedName("drwNo")
    private int drwNo;

    // Getters and Setters

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public String getDrwNoDate() {
        return drwNoDate;
    }

    public void setDrwNoDate(String drwNoDate) {
        this.drwNoDate = drwNoDate;
    }

    public int getDrwtNo1() {
        return drwtNo1;
    }

    public void setDrwtNo1(int drwtNo1) {
        this.drwtNo1 = drwtNo1;
    }

    public int getDrwtNo2() {
        return drwtNo2;
    }

    public void setDrwtNo2(int drwtNo2) {
        this.drwtNo2 = drwtNo2;
    }

    public int getDrwtNo3() {
        return drwtNo3;
    }

    public void setDrwtNo3(int drwtNo3) {
        this.drwtNo3 = drwtNo3;
    }

    public int getDrwtNo4() {
        return drwtNo4;
    }

    public void setDrwtNo4(int drwtNo4) {
        this.drwtNo4 = drwtNo4;
    }

    public int getDrwtNo5() {
        return drwtNo5;
    }

    public void setDrwtNo5(int drwtNo5) {
        this.drwtNo5 = drwtNo5;
    }

    public int getDrwtNo6() {
        return drwtNo6;
    }

    public void setDrwtNo6(int drwtNo6) {
        this.drwtNo6 = drwtNo6;
    }

    public int getBnusNo() {
        return bnusNo;
    }

    public void setBnusNo(int bnusNo) {
        this.bnusNo = bnusNo;
    }

    public long getTotSellamnt() {
        return totSellamnt;
    }

    public void setTotSellamnt(long totSellamnt) {
        this.totSellamnt = totSellamnt;
    }

    public int getFirstPrzwnerCo() {
        return firstPrzwnerCo;
    }

    public void setFirstPrzwnerCo(int firstPrzwnerCo) {
        this.firstPrzwnerCo = firstPrzwnerCo;
    }

    public long getFirstWinamnt() {
        return firstWinamnt;
    }

    public void setFirstWinamnt(long firstWinamnt) {
        this.firstWinamnt = firstWinamnt;
    }

    public int getDrwNo() {
        return drwNo;
    }

    public void setDrwNo(int drwNo) {
        this.drwNo = drwNo;
    }
}
