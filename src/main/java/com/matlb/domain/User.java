package com.matlb.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by prassingh on 3/21/16.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    // An auto-generated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "email_id")
    private String emailId;

    @Column(name = "name")
    private String name;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "create_dt")
    private Date createDt;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "update_dt")
    private Date updateDt;

    @Column(name = "credits")
    private int credits = 0;

    @Column(name = "phone_number")
    private Long phoneNumber = null;

    @NotNull
    @Column(name = "question_count")
    private int questionCount = 0;

    @NotNull
    @Column(name = "answer_count")
    private int answerCount = 0;

    @Column(name = "genre_pref")
    private String genrePref;

    @Column(name = "profile_pic")
    private String profilePic;

    @Column(name = "auth_token")
    private String authToken;

    @Column(name = "gcm_token")
    private String gcmToken;



    // Public methods

    public User() { }

    public User(int userId) {
        this.id = userId;
    }

    public User(String emailId , String authToken) {
        this.emailId = emailId;
        this.authToken = authToken;
    }

    public User(String emailId) {
        this.emailId = emailId;
    }

    public User(String emailId , String authToken , String gcmToken) {
        this.emailId = emailId;
        this.authToken = authToken;
        this.gcmToken = gcmToken;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String email) {
        this.emailId = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDt;
    }

    public Date getUpdateDate() {
        return updateDt;
    }

    public void setCreateDate(Date createDate) {
        this.createDt = createDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDt = updateDate;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public String getGenrePref() {
        return genrePref;
    }

    public void setGenrePref(String genrePref) {
        this.genrePref = genrePref;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getGcmToken() {
        return gcmToken;
    }

    public void setGcmToken(String gcmToken) {
        this.gcmToken = gcmToken;
    }
}
