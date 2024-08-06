package com.example.votingSystem.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.votingSystem.com.Repository.CandidateRepository;
import com.example.votingSystem.com.Repository.ElectionRepository;
import com.example.votingSystem.com.entity.Candidate;
import com.example.votingSystem.com.entity.Election;
import com.example.votingSystem.com.services.CandidateService;
import com.example.votingSystem.com.services.ElectionService;

@Controller
public class CandidateController {

	@Autowired
	CandidateRepository candidateRepository;
	@Autowired
	CandidateService candidateService;

	@GetMapping("/addCandidate")
	public String addElection(Model model)
	{
		model.addAttribute("candidate",new Candidate());
		return "addCandidate";
	}
	
    @PostMapping("/goCandidateAdd")
    public String submitForm(@ModelAttribute("candidate") Candidate candidate , BindingResult result) {
        // handle form submission
    	candidateService.saveCandidate(candidate);
    	System.out.println(candidate.toString());
        return "admindashboard";
    }
    
    //view All Candidate
    //view all 
    @GetMapping("/viewAllCandidate")
    public String viewAllElection(Model model)
    {
    	List<Candidate>allCandidates=candidateService.candList();
    	model.addAttribute("candidates",allCandidates);
    	for(Candidate e:allCandidates)
    	{
    		System.out.println(e);
    	}
    	return "viewAllCandidate";
    }
}
