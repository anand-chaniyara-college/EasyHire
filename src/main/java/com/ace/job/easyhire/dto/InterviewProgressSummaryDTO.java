package com.ace.job.easyhire.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InterviewProgressSummaryDTO {

    @JsonProperty("from_date")
    private String fromDate;

    @JsonProperty("to_date")
    private String toDate;

    @JsonProperty("position_name")
    private String positionName;

    @JsonProperty("total_received_candidate")
    private BigInteger totalReceivedCandidate;

    @JsonProperty("offer_mail")
    private BigInteger offerMail;

    @JsonProperty("accepted_mail")
    private BigInteger acceptedMail;

    @JsonProperty("passed_interview_count")
    private BigDecimal passedInterviewCount;

    @JsonProperty("pending_interview_count")
    private BigDecimal pendingInterviewCount;

    @JsonProperty("cancel_interview_count")
    private BigDecimal cancelInterviewCount;

    @JsonProperty("reached_interview_count")
    private BigDecimal reachedInterviewCount;

    @JsonProperty("interviewed_candidate")
    private BigDecimal interviewedCandidate;

    @JsonProperty("left_to_view")
    private BigDecimal leftToView;

    public InterviewProgressSummaryDTO(String fromDate, String toDate, String positionName,
            BigInteger totalReceivedCandidate, BigInteger offerMail, BigInteger acceptedMail,
            BigDecimal passedInterviewCount, BigDecimal pendingInterviewCount, BigDecimal cancelInterviewCount,
            BigDecimal reachedInterviewCount, BigDecimal interviewedCandidate, BigDecimal leftToView) {
        super();
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.positionName = positionName;
        this.totalReceivedCandidate = totalReceivedCandidate;
        this.offerMail = offerMail;
        this.acceptedMail = acceptedMail;
        this.passedInterviewCount = passedInterviewCount;
        this.pendingInterviewCount = pendingInterviewCount;
        this.cancelInterviewCount = cancelInterviewCount;
        this.reachedInterviewCount = reachedInterviewCount;
        this.interviewedCandidate = interviewedCandidate;
        this.leftToView = leftToView;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public BigInteger getTotalReceivedCandidate() {
        return totalReceivedCandidate;
    }

    public void setTotalReceivedCandidate(BigInteger totalReceivedCandidate) {
        this.totalReceivedCandidate = totalReceivedCandidate;
    }

    public BigInteger getOfferMail() {
        return offerMail;
    }

    public void setOfferMail(BigInteger offerMail) {
        this.offerMail = offerMail;
    }

    public BigInteger getAcceptedMail() {
        return acceptedMail;
    }

    public void setAcceptedMail(BigInteger acceptedMail) {
        this.acceptedMail = acceptedMail;
    }

    public BigDecimal getPassedInterviewCount() {
        return passedInterviewCount;
    }

    public void setPassedInterviewCount(BigDecimal passedInterviewCount) {
        this.passedInterviewCount = passedInterviewCount;
    }

    public BigDecimal getPendingInterviewCount() {
        return pendingInterviewCount;
    }

    public void setPendingInterviewCount(BigDecimal pendingInterviewCount) {
        this.pendingInterviewCount = pendingInterviewCount;
    }

    public BigDecimal getCancelInterviewCount() {
        return cancelInterviewCount;
    }

    public void setCancelInterviewCount(BigDecimal cancelInterviewCount) {
        this.cancelInterviewCount = cancelInterviewCount;
    }

    public BigDecimal getReachedInterviewCount() {
        return reachedInterviewCount;
    }

    public void setReachedInterviewCount(BigDecimal reachedInterviewCount) {
        this.reachedInterviewCount = reachedInterviewCount;
    }

    public BigDecimal getInterviewedCandidate() {
        return interviewedCandidate;
    }

    public void setInterviewedCandidate(BigDecimal interviewedCandidate) {
        this.interviewedCandidate = interviewedCandidate;
    }

    public BigDecimal getLeftToView() {
        return leftToView;
    }

    public void setLeftToView(BigDecimal leftToView) {
        this.leftToView = leftToView;
    }

}
