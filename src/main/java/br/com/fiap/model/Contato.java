package br.com.fiap.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity()
@Table(name = "tbl_contato")
public class Contato {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TBL_CONTATO_SEQ"

    )
    @SequenceGenerator(
            name = "TBL_CONTATO_SEQ",
            sequenceName = "TBL_CONTATO_SEQ",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
