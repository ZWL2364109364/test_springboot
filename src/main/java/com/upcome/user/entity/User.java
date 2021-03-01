package com.upcome.user.entity;

/**
 * user: 张文龙
 * desc: 用户模块：实体类
 * Time: 2021-02-18 21:23
 */
public class User {

    /*1. 属性*/
    private String id;
    private String name;
    private String sex;
    private String age;


    /*2. Get set方法*/

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }


    /*3. toString 方法*/
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
