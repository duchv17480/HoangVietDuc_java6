package com.ph17480.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "accountroles", uniqueConstraints = {
        @UniqueConstraint
                (columnNames = {"username", "rolesid"})
})
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Authority implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;

    @ManyToOne  @JoinColumn(name = "rolesid")
    private Role role;
}
