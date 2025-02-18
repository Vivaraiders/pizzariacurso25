package com.itb.inf3bn.pizzariacurso25.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "Categorias")
@Data
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = true, length = 250)
    private String descricao;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private boolean codStatus;

    @Transient
    private String messageError = "";
    @Transient
    private boolean isValue = true;

}
