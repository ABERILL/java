public class Human {
    public String Name;
    public String Surname;
    public int year_birthday;
    static int year_now = 2022;

    public void biograthy(){
        int age = year_now-year_birthday;
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(age);

    }


}
