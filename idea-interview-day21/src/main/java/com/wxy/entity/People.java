package com.wxy.entity;

public class People {

    private String username;
    private String password;
    private String age;
    public String hobbies;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    public String getHobbies() {

        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public People(String username, String password, String age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public People() {
    }

    public void eat(){
        System.out.println("eat..........");

    }

    public void  eat(String food){
        System.out.println("eat...."+food);


    }


}
