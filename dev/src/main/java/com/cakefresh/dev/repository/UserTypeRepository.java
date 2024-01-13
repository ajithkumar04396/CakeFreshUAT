package com.cakefresh.dev.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cakefresh.dev.models.UserTypeJPA;

@Repository
public interface UserTypeRepository extends JpaRepository<UserTypeJPA, Long>{
	List<UserTypeJPA> findByUserType(String UserType);
}
