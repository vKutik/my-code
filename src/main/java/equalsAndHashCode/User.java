package equalsAndHashCode;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String state;

    public User(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public boolean equals(Object user){
        if (user == this) {
            return true;
        }
        if (user == null) {
            return false;
        }
        if (user.getClass().equals(User.class)) {
            User  current = (User) user;
            return Objects.equals(this.name, current.name) && this.age == current.age
                    && Objects.equals(this.state, current.state);
        }
        return false;
    }

}
