package com.vicky.hibernateDemo.hibernateDemo2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sample")

public class SampleModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int SampleId;
	@Column(name="smpl_name")
	private String Samplename;
	@Column(unique=true)
	private String Samplemail;
	private String Sampleaddr;
	public SampleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SampleModel(int sampleid, String samplename, String samplemail, String sampleaddr) {
		super();
		SampleId = sampleid;
		Samplename = samplename;
		Samplemail = samplemail;
		Sampleaddr = sampleaddr;
	}
	public int getSampleid() {
		return SampleId;
	}
	public void setSampleid(int sampleid) {
		SampleId = sampleid;
	}
	public String getSamplename() {
		return Samplename;
	}
	public void setSamplename(String samplename) {
		Samplename = samplename;
	}
	public String getSamplemail() {
		return Samplemail;
	}
	public void setSamplemail(String samplemail) {
		Samplemail = samplemail;
	}
	public String getSampleaddr() {
		return Sampleaddr;
	}
	public void setSampleaddr(String sampleaddr) {
		Sampleaddr = sampleaddr;
	}
	@Override
	public String toString() {
		return "SampleModel [Sampleid=" + SampleId + ", Samplename=" + Samplename + ", Samplemail=" + Samplemail
				+ ", Sampleaddr=" + Sampleaddr + "]";
	}
	

}
