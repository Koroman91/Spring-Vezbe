package com.korolija.info;

import java.util.List;
import java.util.Set;

import com.korolija.model.Student;

public class OrgInfo {
	
	private Student[] studArr = new Student[2];
	private List<Student> studList;
	private Set<Student> studSet;
	
	
	public Student[] getStudArr() {
		return studArr;
	}
	public void setStudArr(Student[] studArr) {
		this.studArr = studArr;
	}
	public List<Student> getStudList() {
		return studList;
	}
	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}
	public Set<Student> getStudSet() {
		return studSet;
	}
	public void setStudSet(Set<Student> studSet) {
		this.studSet = studSet;
	}
	
	

}
