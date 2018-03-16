package za.co.edutrack.mapper;

import java.util.ArrayList;
import java.util.List;
import za.co.edutrack.domain.Grade;
import za.co.edutrack.domain.Mark;
import za.co.edutrack.domain.School;
import za.co.edutrack.domain.Student;
import za.co.edutrack.domain.Subject;
import za.co.edutrack.model.GradeQueryModel;
import za.co.edutrack.model.MarkQueryModel;
import za.co.edutrack.model.SchoolQueryModel;
import za.co.edutrack.model.StudentQueryModel;
import za.co.edutrack.model.SubjectQueryModel;

/**
 * <p>
 * Title: Mapper</p>
 * <p/>
 * <p>
 * Description: </p>
 * <p/>
 * <p>
 * Copyright: Copyright (c) 2018</p>
 * <p/>
 * <p>
 * Company: Discovery</p>
 *
 * @author Thabo Thulare
 * @version 1.0
 */
public class Mapper {

    public static StudentQueryModel toStudentQueryModel(Student from) {
        StudentQueryModel student = new StudentQueryModel();

        student.setStudentId(from.getId());
        student.setFirstname(from.getFirstname());
        student.setSurname(from.getSurname());
        student.setDob(from.getDob());
        student.setGender(from.getGender());
        student.setZip(from.getZip());
        student.setCitizenship(from.getCitizenship());
        student.setIdNumber(from.getId_number());
        
        student.setUsername(from.getUsername());
        student.setPassword(from.getPassword());
        student.setCellphone(from.getCellphone());

        return student;
    }
    
    public static SchoolQueryModel toSchoolQueryModel(School from){
        SchoolQueryModel school = new SchoolQueryModel();
        
        school.setSchoolId(from.getId());
        school.setEmisNumber(from.getEmis());
        school.setSchoolName(from.getSchool_name());
        school.setProvince(from.getProvince());
        school.setDistrict(from.getDistrict());
        school.setRegion(from.getRegion());
        
        return school;
    }

    public static GradeQueryModel toGradeQueryModel(Grade from) {
        GradeQueryModel grade = new GradeQueryModel();

        grade.setGradeId(from.getId());
        grade.setGrade((long) from.getGrade());
        grade.setGradeYear((long) from.getGrade_year());

//        StudentQueryModel studentQueryModel = toStudentQueryModel(from.getStudent());
//        grade.setStudentId(studentQueryModel);

        return grade;
    }

    public static SubjectQueryModel toSubjectQueryModel(Subject from) {
        SubjectQueryModel subject = new SubjectQueryModel();

        subject.setId(from.getId());
        subject.setSubjectName(from.getSubjectName());

        return subject;
    }

    public static MarkQueryModel toMarkQueryModel(Mark from) {
        MarkQueryModel mark = new MarkQueryModel();
        mark.setId(from.getId());
        mark.setMark(from.getMark());

        SubjectQueryModel subjectQueryModel = toSubjectQueryModel(from.getSubject());
        mark.setSubject(subjectQueryModel);

        return mark;
    }

    public static List<SubjectQueryModel> toSubjectQueryModel(List<Subject> fromList) {
        List<SubjectQueryModel> subjectList = new ArrayList<SubjectQueryModel>();
        for (Subject subject : fromList) {
            subjectList.add(toSubjectQueryModel(subject));
        }
        return subjectList;
    }

    public static List<MarkQueryModel> toMarkQueryModel(List<Mark> fromList) {
        List<MarkQueryModel> markList = new ArrayList<MarkQueryModel>();
        for (Mark mark : fromList) {
            markList.add(toMarkQueryModel(mark));
        }

        return markList;
    }

    public static List<StudentQueryModel> toStudentQueryModel(List<Student> fromList) {
        List<StudentQueryModel> studentList = new ArrayList<StudentQueryModel>();
        for (Student student : fromList) {
            studentList.add(toStudentQueryModel(student));
        }

        return studentList;
    }

    public static List<GradeQueryModel> toGradeQueryModels(List<Grade> fromList) {
        List<GradeQueryModel> gradeList = new ArrayList<GradeQueryModel>();
        for (Grade grade : fromList) {
            gradeList.add(toGradeQueryModel(grade));
        }

        return gradeList;
    }
    
    public static List<SchoolQueryModel> toSchoolQueryModel(List<School> fromList){
        List<SchoolQueryModel> schoolList = new ArrayList<SchoolQueryModel>();
        
        for(School school : fromList){
            schoolList.add(toSchoolQueryModel(school));
        }
        
        return schoolList;
    }

}
