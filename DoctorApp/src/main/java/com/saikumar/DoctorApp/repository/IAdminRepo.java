package com.saikumar.DoctorApp.repository;

import com.saikumar.DoctorApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
