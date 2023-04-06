import java.util.*;

public class Main {
    public static void main(String[] args) {

        University mfti = new University("МФТИ", 30000, 2000, 85);
        University mgu = new University("МГУ", 40000, 2500, 80);
        University dvgyups = new University("ДВГУПС", 15000, 1000, 70);

        University spbgu = new University("СПбГУ", 35000, 3000, 90);
        University vse = new University("ВШЭ", 20000, 1500, 75);
        University mgimo = new University("МГИМО", 25000, 1800, 78);

        Set<University> technicalUniversity = new HashSet<>();
        technicalUniversity.add(mfti);
        technicalUniversity.add(mgu);
        technicalUniversity.add(dvgyups);
        technicalUniversity.add(spbgu);
        technicalUniversity.add(vse);

        Set<University> humanitiesUniversity = new HashSet<>();
        humanitiesUniversity.add(vse);
        humanitiesUniversity.add(mgimo);
        humanitiesUniversity.add(mgu);
        humanitiesUniversity.add(spbgu);

        Set<University> allUniversities = new HashSet<>(); //все университеты
        allUniversities.addAll(technicalUniversity);
        allUniversities.addAll(humanitiesUniversity);


        Set<University> mixedUniversities = new HashSet<>(); //смешанные университеты
        for (University university : allUniversities) {
            if (technicalUniversity.contains(university) && humanitiesUniversity.contains(university)) {
                mixedUniversities.add(university);
            }
        }

        Set<University> specializedUniversities = new HashSet<>(); //специализированные университеты
        for (University university : allUniversities) {
            if ((!technicalUniversity.contains(university) && humanitiesUniversity.contains(university)) ||
                    (technicalUniversity.contains(university) && !humanitiesUniversity.contains(university))) {
                specializedUniversities.add(university);
            }
        }

        System.out.println("Все университеты: " + allUniversities);
        System.out.println("Смешанные университеты: " + mixedUniversities);
        System.out.println("Специализированные университеты: " + specializedUniversities);

        System.out.println("Общее количество студентов во всех университетов: " +
                getTotalNumberOfStudents(allUniversities));
        System.out.println("Общее количество всех преподавателей во всех университетов: " +
                getTotalNumberOfTeachers(allUniversities));
        System.out.println("Средний балл во всех университетов: " +
                getAverageEgeScore(allUniversities));
        System.out.println("Общее количество студентов в смешанных университетов: " +
                getTotalNumberOfStudents(mixedUniversities));
        System.out.println("Общее количество преподавателей в смешанных университетов: " +
                getTotalNumberOfTeachers(mixedUniversities));
        System.out.println("Средний балл в смешанных университетов: " +
                getAverageEgeScore(mixedUniversities));
        System.out.println("Общее количество студентов в специализированных университетов: " +
                getTotalNumberOfStudents(specializedUniversities));
        System.out.println("Общее количество преподавателей в специализированных университетов: " +
                getTotalNumberOfTeachers(specializedUniversities));
        System.out.println("Средний балл в специализированных университетов: " +
                getAverageEgeScore(specializedUniversities));


        //2

        City moscow = new City("Москва",15000000);
        City sankt_peterburg = new City("Санкт-Петербург",13000000);
        City habarovsk = new City("Хабаровск",7000000);

        Map<University, City > test = new HashMap<>();

        test.put(mfti,moscow);
        test.put(mgu,moscow);
        test.put(dvgyups,habarovsk);
        test.put(spbgu,sankt_peterburg);
        test.put(vse,sankt_peterburg);
        test.put(mgimo,moscow);

        for (Map.Entry<University,City> entry: test.entrySet()) {
            University key = entry.getKey();
            City value = entry.getValue();
            double count = value.getPopulation()/ key.amount_students;
            System.out.println(count+" Столько приходится жителей "+value.getName()+" на одного студента "+key.getName());

        }


    }
    private static int getTotalNumberOfStudents(Set<University> universities) {
        int totalNumberOfStudents = 0;
        for (University university : universities) {
            totalNumberOfStudents += university.amount_students;
        }
        return totalNumberOfStudents;
    }
    private static int getTotalNumberOfTeachers(Set<University> universities) {
        int totalNumberOfTeachers = 0;
        for (University university : universities) {
            totalNumberOfTeachers += university.amount_tutors;
        }
        return totalNumberOfTeachers;
    }
    private static double getAverageEgeScore(Set<University> universities) {
        double sumOfEgeScores = 0;
        for (University university : universities) {

            sumOfEgeScores += university.ball;
        }
        return sumOfEgeScores / universities.size();
    }

}