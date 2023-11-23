package org.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "postgres")
public class UserData {
    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;
    @Basic
    @Column(name = "userpassword", nullable = false, length = -1)
    private String userpassword;
    @Basic
    @Column(name = "username", nullable = false, length = -1)
    private String username;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(email, userData.email) && Objects.equals(userpassword, userData.userpassword) && Objects.equals(username, userData.username) && Objects.equals(id, userData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, userpassword, username, id);
    }
}
