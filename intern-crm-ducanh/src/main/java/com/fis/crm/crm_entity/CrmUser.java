package com.fis.crm.crm_entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CRM_USER", schema = "CRM_UAT", catalog = "")
//@JsonIdentityInfo(
//    generator = ObjectIdGenerators.PropertyGenerator.class,
//    property = "userid")
public class CrmUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "USERID")
    private Long userid;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "FULLNAME")
    private String fullname;
    @Basic
    @Column(name = "CREATEDATE")
    private Date createdate;
    @Basic
    @Column(name = "PHONE")
    private String phone;
    @Basic
    @Column(name = "BIRTHDAY")
    private Date birthday;
    @Basic
    @Column(name = "ADDRESS")
    private String address;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CrmUserRole> userRoles;
    @OneToMany(mappedBy = "user")
    private Set<CrmCandidate> candidates;
    @ManyToMany(mappedBy = "users")
    Set<CrmInterview> interviews;

    //
    @OneToMany(mappedBy = "giverTask")
    private List<CrmTask> giverTask;
    @OneToMany(mappedBy = "receiverTask")
    private List<CrmTask> receiverTask;

    public CrmUser() {
    }

    public CrmUser(Long userid, String username, String password, String fullname, Date createdate, String phone, Date birthday, String address, String status, Set<CrmUserRole> userRoles, Set<CrmCandidate> candidates) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.createdate = createdate;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.status = status;
        this.userRoles = userRoles;
        this.candidates = candidates;
    }

    public Long getUserid() {return userid;}

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<CrmUserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<CrmUserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Set<CrmCandidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<CrmCandidate> candidates) {
        this.candidates = candidates;
    }

}
