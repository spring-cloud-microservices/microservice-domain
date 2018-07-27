package com.quadbaze.microservice.domain.entities;

import com.quadbaze.microservice.domain.base.RootEntity;
import com.quadbaze.microservice.domain.enums.RoleType;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends RootEntity {

    @Column(name = "role_type", unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public int hashCode() {
        return hashCoder()
                .append(this.getId())
                .append(this.getRoleType())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Role)) return false;
        if (obj == this) return true;
        return equalizer()
                .append(this.getRoleType(), ((Role)obj).getRoleType())
                .isEquals();
    }

}
