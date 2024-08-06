package com.example.votingSystem.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String party;
	private String election;
	private String manifesto;
	private String status;
	public Candidate(int cid, String cname, String party, String election, String manifesto, String status) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.party = party;
		this.election = election;
		this.manifesto = manifesto;
		this.status = status;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getElection() {
		return election;
	}
	public void setElection(String election) {
		this.election = election;
	}
	public String getManifesto() {
		return manifesto;
	}
	public void setManifesto(String manifesto) {
		this.manifesto = manifesto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", cname=" + cname + ", party=" + party + ", election=" + election
				+ ", manifesto=" + manifesto + ", status=" + status + "]";
	}
	
	
}
