package com.quadbaze.microservice.domain.repositories;

import com.quadbaze.microservice.domain.entities.Role;
import com.quadbaze.microservice.domain.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByRoleType(RoleType roleType);
    List<Role> findRolesByIdIn(List<Long> roleIds);
    List<Role> findRolesByRoleTypeIn(List<RoleType> roleTypes);

}
