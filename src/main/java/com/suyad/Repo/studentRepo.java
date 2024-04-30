package com.suyad.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suyad.Entity.Students;

public interface studentRepo extends JpaRepository<Students, Integer>
{

}
