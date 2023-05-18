package com.selfLearning.springBootCrud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfLearning.springBootCrud.entity.Subject;
import com.selfLearning.springBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	public SubjectRepository subjectRepo;

	public List<Subject> getAllSubjects() {

		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);

	}

	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);

	}

	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}

	public Optional<Subject> getSubjectById(String id) {

		// List<Subject> subjects = new ArrayList<>();
		return subjectRepo.findById(id);
		// return subjects;
	}

}
