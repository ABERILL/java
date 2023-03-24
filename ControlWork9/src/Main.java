import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Что такое конструктор у класса?",List.of("метод, который вызывается при создании экземпляра объекта;",
                "специальная переменная класса;","объект класса;"),0));
        questions.add(new Question("Если у класса в теле не объявлен конструктор тогда",List.of("у данного класса автоматически создается конструктор по умолчанию;",
                "нельзя создать объект этого класса;","код не скомпилируется;"),0));
        questions.add(new Question("Сколько конструкторов может быть у класса?",List.of("неограниченное количество;",
                "только один;","не более пяти;"),0));
        questions.add(new Question("Переменные в классе инициализируется",List.of("1.\tв порядке их объявления;",
                "все одновременно;","в случайном порядке;"),0));
        questions.add(new Question("Для каких целей служат методы get и set",List.of("чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса;",
                "это специальные конструкторы класса;"),0));


        Scanner scanner = new Scanner(System.in);
        List<Answer> answers = new ArrayList<>();
        for (Question question : questions) {
            System.out.println(question.getText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ") " + options.get(i));
            }
            int answerIndex = scanner.nextInt() - 1;
            answers.add(new Answer(question, answerIndex));
        }
        int correctAnswersCount = 0;
        List<Answer> incorrectAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if (answer.answerIndex == answer.question.getCorrectOptionIndex()) {
                correctAnswersCount++;
            } else {
                incorrectAnswers.add(answer);
            }
        }
        System.out.println("Вы ответили на " + questions.size() + " вопросов и получили " + correctAnswersCount + " правильных ответов.");
        if (!incorrectAnswers.isEmpty()) {
            System.out.println("Вы ошиблись в следующих вопросах:");
            for (Answer answer : incorrectAnswers) {
                System.out.println(answer.toString());
            }
        }



    }
}