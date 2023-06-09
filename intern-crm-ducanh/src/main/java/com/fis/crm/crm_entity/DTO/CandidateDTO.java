package com.fis.crm.crm_entity.DTO;

import java.sql.Date;

public class CandidateDTO {
    private Long candidateId;
    private String fullname;
    private String phone;
    private Date birthday;
    private String address;
    private Boolean status;
    private Date createDate;
    private InterviewStatusDTO interviewStatusDTO;
    private Crm_UserDTO crmUserDTO;

    public CandidateDTO() {
    }

    public CandidateDTO(Long candidateId, String fullname, String phone, Date birthday, String address, Boolean status, Date createDate, InterviewStatusDTO interviewStatusDTO, Crm_UserDTO crmUserDTO) {
        this.candidateId = candidateId;
        this.fullname = fullname;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.status = status;
        this.createDate = createDate;
        this.interviewStatusDTO = interviewStatusDTO;
        this.crmUserDTO = crmUserDTO;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public InterviewStatusDTO getInterviewStatusDTO() {
        return interviewStatusDTO;
    }

    public void setInterviewStatusDTO(InterviewStatusDTO interviewStatusDTO) {
        this.interviewStatusDTO = interviewStatusDTO;
    }

    public Crm_UserDTO getCrmUserDTO() {
        return crmUserDTO;
    }

    public void setCrmUserDTO(Crm_UserDTO crmUserDTO) {
        this.crmUserDTO = crmUserDTO;
    }
}
