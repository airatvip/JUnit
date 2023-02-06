package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class UserTest {
    User user = new User("kristina", "kris@mail.ru");
    User user1 = new User("samuel", "sam@ya.ru");
    User user2 = new User("horse", "horse@gmail.com");

    @Test
    @DisplayName("When passed two arguments in the constructor then return Object")
    void fullArguments() {
        String actualResultLogin = user.getLogin();
        String actualResultEmail = user.getEmail();
        Assertions.assertEquals("kristina", actualResultLogin);
        Assertions.assertEquals("kris@mail.ru", actualResultEmail);
    }

    @Test
    @DisplayName("When passed without arguments in the constructor then return Object")
    void withoutArguments() {
        String actualResultLogin = user1.getLogin();
        String actualResultEmail = user1.getEmail();
        Assertions.assertNotNull(actualResultLogin);
        Assertions.assertNotNull(actualResultEmail);
    }

    @Test
    @DisplayName("Correct Email address")
    void correctEmailAddress() {
        Assertions.assertTrue(user2.getEmail().contains("."));
        Assertions.assertTrue(user2.getEmail().contains("@"));
    }

    @Test
    @DisplayName("When !login.equals(email) return true")
    public void LoginAndEmailEqual() {
        Assertions.assertNotEquals(user2.getLogin(), user2.getEmail());
    }
}
