import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap { 
   public static List<String> highEnrollmentStudents(Map<String, List<Course>> courseListsByStudentName, int unitThreshold) {
        List<String> overEnrolledStudents = new LinkedList<>();
        for (String x : courseListsByStudentName.keySet()) {
            int numUnits = 0;
            for (Course subject : courseListsByStudentName.get(x)) {
                numUnits += subject.getNumUnits();
            }
            if (numUnits > unitThreshold) {
                overEnrolledStudents.add(x);
            }
        }
        return overEnrolledStudents;
   }
}
