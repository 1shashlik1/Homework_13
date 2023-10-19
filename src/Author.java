public class Author {

    //данные об имени и фамилии автора.
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String toString() {
        return getName() + " " + getSurname();
    }


}
