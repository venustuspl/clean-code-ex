package pl.praktycznajava.module4.cleancode.challenge1.model;

// FIXME nieskończona implementacja
public class Student {
    public void addECTSPoints(int ectsPoints) {}
    public void addECTSPoints(Course course, CourseStatistics courseStatistics) {
        // jeśli kurs został zaliczony, to dodaj studentowi punkty ECTS - komentarz do usunięcia
        if (courseStatistics.getAttendancePercentage() >= 50 && courseStatistics.getGradeAverage() >= 50) {
            this.addECTSPoints(course.getECTSPoints());
        }
    }
}
