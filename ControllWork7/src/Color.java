public enum Color {
    ЗЕЛЁНЫЙ(Model.АУДИ),
    ЧЁРНЫЙ(Model.ФОРД),
    СИНИЙ(Model.ХОНДА),
    БЕЛЫЙ(Model.ЯГУАР),
    КРАСНЫЙ(Model.НИСАН);

    public Enum name;

    Color(Enum name) {
        this.name = name;
    }
}
