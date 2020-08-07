package net.alterapp.miniproject3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(
        name = "seq",
        sequenceName = "s_customer",
        initialValue = 1,
        allocationSize = 1
)
public class Customer extends AuditModel {
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;
}
