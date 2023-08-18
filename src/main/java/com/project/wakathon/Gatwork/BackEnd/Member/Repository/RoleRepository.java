package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
