package com.stoneCod.Barberia.model;

//import com.stoneCod.Barberia.enums.Enum_Rol;
import lombok.*;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
//import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombreEmpresa", nullable = false, unique = true, length = 50)
    private String nombreEmpresa;

    @Column(name = "direccionEmpresa", nullable = false,unique = true, length = 50)
    private String direccionEmpresa;

    @Column(name = "telefonoEmpresa", nullable = false)
    private int telefonoEmpresa;

    @Column(name = "nit", nullable = false)
    private int nit;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "rol", nullable = false)
//    private Enum_Rol rol;

//    @CreationTimestamp
//    @Column(name = "fecha_creacion")
//    private LocalDateTime fechaCreacion;
//
//    @UpdateTimestamp
//    @Column(name = "fecha_actualizacion")
//    private LocalDateTime fechaActualizacion;
}
