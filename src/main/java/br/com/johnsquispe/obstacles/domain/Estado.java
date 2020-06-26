package br.com.johnsquispe.obstacles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "ESTADO")
public class Estado {

    @Id
    @GenericGenerator(name = "estadoSequenceGenerator",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence_name", value = "ESTADO_SEQUENCE"),
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estadoSequenceGenerator")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "UF")
    private String uf;

    @Column(name = "UUID")
    private UUID uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

}
