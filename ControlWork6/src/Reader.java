public class Reader {
    public String FIO;
    public String number;
    public String facultet;
    public String data_birthday;
    public String telefhone;

    public Reader(String FIO, String number, String facultet, String data_birthday, String telefhone) {
        this(FIO);
        this.number = number;
        this.facultet = facultet;
        this.data_birthday = data_birthday;
        this.telefhone = telefhone;
    }
    public Reader(String FIO) {
        this.FIO = FIO;
    }

    public Reader() {
    }
    public void takeBook(int count){
        System.out.println(count+" книги");
    }

    public void takeBook(String... names){
        System.out.print("Приключения, ");
        System.out.print("Словарь, ");
        System.out.print("Энциклопедия. ");
    }

    public void returnBook(int count) {
        System.out.println(count + " книги");
    }

    public void returnBook(String... names){
        System.out.print("Приключения, ");
        System.out.print("Словарь, ");
        System.out.print("Энциклопедия. ");
    }
}
