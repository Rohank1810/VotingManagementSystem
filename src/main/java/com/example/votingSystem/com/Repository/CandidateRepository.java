package com.example.votingSystem.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.votingSystem.com.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer> {

}
