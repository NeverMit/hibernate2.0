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
public class UserData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
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
