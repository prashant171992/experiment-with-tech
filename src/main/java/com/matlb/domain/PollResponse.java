package com.matlb.domain;

import java.util.Date;

/**
 * Created by prassingh on 8/21/16.
 */
public class PollResponse {

    public PollResponse(){

    }

    public PollResponse(Poll poll) {
        this.genre = poll.getGenre().name();
        this.optACount = poll.getOptACount();
        this.optBCount = poll.getOptBCount();
        this.optCCount = poll.getOptCCount();
        this.optDCount = poll.getOptDCount();
        this.optECount = poll.getOptECount();
        this.validTill = poll.getValidUpto();
        this.questionText = poll.getPollQuestion().getQuestionText();
        this.optionAText = poll.getPollQuestion().getOptionA();
        this.optionBText = poll.getPollQuestion().getOptionB();
        this.optionCText = poll.getPollQuestion().getOptionC();
        this.optionDText = poll.getPollQuestion().getOptionD();
        this.optionEText = poll.getPollQuestion().getOptionE();
        this.peopleAsked = 0;
        this.creditsUsed = 0;
    }

    private String questionText;

    private String optionAText;

    private String optionBText;

    private String optionCText;

    private String optionDText;

    private String optionEText;

    private String genre;

    private int optACount;

    private int optBCount;

    private int optCCount;

    private int optDCount;

    private int optECount;

    private Date validTill;

    private int peopleAsked;

    private int creditsUsed;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getOptACount() {
        return optACount;
    }

    public void setOptACount(int optACount) {
        this.optACount = optACount;
    }

    public int getOptBCount() {
        return optBCount;
    }

    public void setOptBCount(int optBCount) {
        this.optBCount = optBCount;
    }

    public int getOptCCount() {
        return optCCount;
    }

    public void setOptCCount(int optCCount) {
        this.optCCount = optCCount;
    }

    public int getOptDCount() {
        return optDCount;
    }

    public void setOptDCount(int optDCount) {
        this.optDCount = optDCount;
    }

    public int getOptECount() {
        return optECount;
    }

    public void setOptECount(int optECount) {
        this.optECount = optECount;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public int getPeopleAsked() {
        return peopleAsked;
    }

    public void setPeopleAsked(int peopleAsked) {
        this.peopleAsked = peopleAsked;
    }

    public int getCreditsUsed() {
        return creditsUsed;
    }

    public void setCreditsUsed(int creditsUsed) {
        this.creditsUsed = creditsUsed;
    }

    public String getOptionAText() {
        return optionAText;
    }

    public void setOptionAText(String optionAText) {
        this.optionAText = optionAText;
    }

    public String getOptionBText() {
        return optionBText;
    }

    public void setOptionBText(String optionBText) {
        this.optionBText = optionBText;
    }

    public String getOptionCText() {
        return optionCText;
    }

    public void setOptionCText(String optionCText) {
        this.optionCText = optionCText;
    }

    public String getOptionDText() {
        return optionDText;
    }

    public void setOptionDText(String optionDText) {
        this.optionDText = optionDText;
    }

    public String getOptionEText() {
        return optionEText;
    }

    public void setOptionEText(String optionEText) {
        this.optionEText = optionEText;
    }
}