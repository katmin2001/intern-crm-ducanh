package com.fis.crm.crm_entity;

import com.fis.crm.crm_entity.DTO.Crm_UserDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CRM_ROLE", schema = "CRM_UAT", catalog = "")
public class CrmRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ROLEID")
    private Long roleid;
    @Basic
    @Column(name = "ROLENAME")
    private String rolename;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CrmUserRole> roleUsers;
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CrmRoleFunction> roleFuncs;

    public CrmRole() {
    }

    public CrmRole(Long roleid, String rolename, Set<CrmUserRole> roleUsers, Set<CrmRoleFunction> roleFuncs) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.roleUsers = roleUsers;
        this.roleFuncs = roleFuncs;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Set<CrmUserRole> getRoleUsers() {
        return roleUsers;
    }

    public void setRoleUsers(Set<CrmUserRole> roleUsers) {
        this.roleUsers = roleUsers;
    }

    public Set<CrmRoleFunction> getRoleFuncs() {
        return roleFuncs;
    }

    public void setRoleFuncs(Set<CrmRoleFunction> roleFuncs) {
        this.roleFuncs = roleFuncs;
    }
}
