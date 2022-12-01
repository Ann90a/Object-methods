import java.util.Objects;

public class Author {

    private String name;
    private String lastName;


    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return getName().equals(author.getName()) && getLastName().equals(author.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
