package br.com.johnsquispe.obstacles.domain;

import javax.persistence.*;

@Embeddable
public class Local {

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "CEP")
    private String cep;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "CIDADE_ID")
    private Cidade cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
