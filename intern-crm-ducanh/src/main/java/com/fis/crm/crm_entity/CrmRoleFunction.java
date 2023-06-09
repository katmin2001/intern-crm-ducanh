package com.fis.crm.crm_entity;

import javax.persistence.*;

@Entity
@Table(name = "CRM_ROLE_FUNCTION", schema = "CRM_UAT", catalog = "")
public class CrmRoleFunction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RFID")
    private Long rfid;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ROLEID", referencedColumnName = "ROLEID")
    private CrmRole role;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "FUNCID", referencedColumnName = "FUNCID")
    private CrmFunction function;

    public CrmRoleFunction() {
    }

    public CrmRoleFunction(Long rfid, CrmRole role, CrmFunction function) {
        this.rfid = rfid;
        this.role = role;
        this.function = function;
    }

    public Long getRfid() {
        return rfid;
    }

    public void setRfid(Long rfid) {
        this.rfid = rfid;
    }

    public CrmRole getRole() {
        return role;
    }

    public void setRole(CrmRole role) {
        this.role = role;
    }

    public CrmFunction getFunction() {
        return function;
    }

    public void setFunction(CrmFunction function) {
        this.function = function;
    }
}
