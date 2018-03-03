package za.co.edutrack.mapper;

import java.util.ArrayList;
import java.util.List;
import za.co.edutrack.domain.Mark;
import za.co.edutrack.domain.Subject;
import za.co.edutrack.model.MarkQueryModel;
import za.co.edutrack.model.SubjectQueryModel;

/**
 * <p>Title: Mapper</p>
 * <p/>
 * <p>Description: </p>
 * <p/>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p/>
 * <p>Company: Discovery</p>
 *
 * @author Thabo Thulare
 * @version 1.0
 */
public class Mapper
{

  public static SubjectQueryModel toSubjectQueryModel(Subject from)
  {
    SubjectQueryModel subject = new SubjectQueryModel();
    
    subject.setId(from.getId());
    subject.setSubjectName(from.getSubjectName());
    
    return subject;
  }
  
  public static MarkQueryModel toMarkQueryModel(Mark from)
  {
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
      
      public static List<MarkQueryModel> toMarkQueryModel(List<Mark> fromList)
      {
          List<MarkQueryModel> markList = new ArrayList<MarkQueryModel>();
          for(Mark mark: fromList)
          {
              markList.add(toMarkQueryModel(mark));
          }
          
          return markList;
      }
}
