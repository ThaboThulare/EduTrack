/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.edutrack;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.edutrack.domain.Mark;
import za.co.edutrack.domain.Student;
import za.co.edutrack.domain.Subject;
import static za.co.edutrack.mapper.Mapper.toMarkQueryModel;
import static za.co.edutrack.mapper.Mapper.toStudentQueryModel;
import static za.co.edutrack.mapper.Mapper.toSubjectQueryModel;
import za.co.edutrack.model.MarkQueryModel;
import za.co.edutrack.model.StudentQueryModel;
import za.co.edutrack.model.SubjectQueryModel;
import za.co.edutrack.repository.MarkRepository;
import za.co.edutrack.repository.StudentRepository;
import za.co.edutrack.repository.SubjectRepository;

/**
 *
 * @author THABO64
 */
@RestController
public class Service 
{
    private static final Logger log = LoggerFactory.getLogger(Service.class);
    
    @Autowired
    private MarkRepository markRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    
    @Autowired
    private SubjectRepository subjectRepository;
    

    @RequestMapping(value = "api/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public List<StudentQueryModel> findAllStudents(){
            log.info("find all students");
            List<Student> students = studentRepository.findAll();
            log.info("found all stutudents - size:{}", students.size());
            return toStudentQueryModel(students);
        }
    
    	@RequestMapping(value = "api/mark", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MarkQueryModel> findAllMarks() {
		log.info("find all marks");
		List<Mark> marks = markRepository.findAll();
		log.info("found all marks - size:{}", marks.size());
		return toMarkQueryModel(marks);
	}
        
        @RequestMapping(value = "api/subject", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public List<SubjectQueryModel> findAllSubejct()
        {
            
            log.info("get all subject");
            List<Subject> subject = subjectRepository.findAll();
            log.info("found all marks - side : ", subject.size());
            return toSubjectQueryModel(subject);
        }
        
        @RequestMapping(value = "api/mark/{id}", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
        public MarkQueryModel findMarkById(@PathVariable("id") Long id)
        {
            Mark mark = markRepository.findOne(id);
            
            return toMarkQueryModel(mark);
        }
}
