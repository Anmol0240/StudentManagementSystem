package com.enterprise.sms.repository;

import com.enterprise.sms.entity.Role;
import com.enterprise.sms.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);

    boolean existsByName(RoleName name);

}
