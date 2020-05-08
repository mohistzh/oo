package com.github.mohistzh.oo.parking.people;

import com.github.mohistzh.oo.parking.pojo.AccountStatus;
import com.github.mohistzh.oo.parking.pojo.Person;

/**
 * An abstract class defines common variable and behaviour which represents various people that interact with our system
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean resetPassword(){return  false;}
}
