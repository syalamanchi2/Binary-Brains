package com.vm.binarybrainsnew.model;

import java.util.ArrayList;

public class Root{
    private ArrayList<String> allowedIllnessLimits;
    private ArrayList<String> benifits;
    private String allowIllness;
    private String insurerName;
    private String premiumPerMonth;
    private String yearlyCoverageInLakhs;
    private String policyPeriod;
    private String rating;
    private String setelmentPercentage;
    private String policyID;

    public ArrayList<String> getAllowedIllnessLimits() {
        return allowedIllnessLimits;
    }

    public void setAllowedIllnessLimits(ArrayList<String> allowedIllnessLimits) {
        this.allowedIllnessLimits = allowedIllnessLimits;
    }

    public ArrayList<String> getBenifits() {
        return benifits;
    }

    public void setBenifits(ArrayList<String> benifits) {
        this.benifits = benifits;
    }

    public String isAllowIllness() {
        return allowIllness;
    }

    public void setAllowIllness(String allowIllness) {
        this.allowIllness = allowIllness;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getPremiumPerMonth() {
        return premiumPerMonth;
    }

    public void setPremiumPerMonth(String premiumPerMonth) {
        this.premiumPerMonth = premiumPerMonth;
    }

    public String getYearlyCoverageInLakhs() {
        return yearlyCoverageInLakhs;
    }

    public void setYearlyCoverageInLakhs(String yearlyCoverageInLakhs) {
        this.yearlyCoverageInLakhs = yearlyCoverageInLakhs;
    }

    public String getPolicyPeriod() {
        return policyPeriod;
    }

    public void setPolicyPeriod(String policyPeriod) {
        this.policyPeriod = policyPeriod;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSetelmentPercentage() {
        return setelmentPercentage;
    }

    public void setSetelmentPercentage(String setelmentPercentage) {
        this.setelmentPercentage = setelmentPercentage;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }
}