package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        BootStrap bootStrap = new BootStrap();

        bootStrap.createUsersTest();

        bootStrap.actionTest();

        bootStrap.deleteUserTest();

        System.out.println(bootStrap.loginTest());

    }
}
