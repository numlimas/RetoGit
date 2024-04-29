package user;

import interf.IHora;

public class User implements IHora {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hora(int hora, int min, int sec) {
        //Hace algo
    }
}
