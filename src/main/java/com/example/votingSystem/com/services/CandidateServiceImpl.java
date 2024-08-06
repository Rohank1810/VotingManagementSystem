package com.example.votingSystem.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.votingSystem.com.Repository.CandidateRepository;
import com.example.votingSystem.com.entity.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateRepository candidateRepository;
	public void saveCandidate(Candidate can) {
		candidateRepository.save(can);
	}
	
	public List<Candidate> candList(){
		return candidateRepository.findAll();
	}
}
