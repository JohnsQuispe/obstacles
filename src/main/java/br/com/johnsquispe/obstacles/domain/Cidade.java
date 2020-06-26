package br.com.johnsquispe.obstacles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "CIDADE")
public class Cidade {

    @Id
    @Column(name = "ID")
    @GenericGenerator(name = "cidadeSequenceGenerator",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence_name", value = "CIDADE_SEQUENCE"),
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cidadeSequenceGenerator")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CIDADE_URL")
    private String cidadeUrl;

    @Column(name = "UUID")
    private UUID uuid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_ID")
    private Estado estado;

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

    public String getCidadeUrl() {
        return cidadeUrl;
    }

    public void setCidadeUrl(String cidadeUrl) {
        this.cidadeUrl = cidadeUrl;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

}
