class Answer {
    public Question question;
    public int answerIndex;
    public Answer(Question question, int answerIndex) {
        this.question = question;
        this.answerIndex = answerIndex;
    }
    @Override
    public String toString() {
        String result = "Вопрос " + question.getText() + "\n";
        result += "Ваш ответ: " + question.getOptions().get(answerIndex) + "\n";
        result += "Правильный ответ: " + question.getOptions().get(question.getCorrectOptionIndex()) + "\n";
        return result;
    }
}
