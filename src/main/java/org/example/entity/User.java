package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "postgres")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String username;

    @Column(name = "userpassword",nullable = false)
    private String userpassword;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User userData = (User) o;
        return Objects.equals(email, userData.email) && Objects.equals(userpassword, userData.userpassword) && Objects.equals(username, userData.username) && Objects.equals(id, userData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, userpassword, username, id);
    }
}
