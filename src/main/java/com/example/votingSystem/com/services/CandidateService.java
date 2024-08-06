package com.example.votingSystem.com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.votingSystem.com.entity.Candidate;

@Service
public interface CandidateService {

	public void saveCandidate(Candidate can);
	public List<Candidate> candList();
}
