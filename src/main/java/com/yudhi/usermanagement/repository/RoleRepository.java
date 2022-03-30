package com.yudhi.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yudhi.usermanagement.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByKey(String key);

	Boolean existsByKey(String key);

	Boolean existsByTitleAndKey(String title, String key);

}
