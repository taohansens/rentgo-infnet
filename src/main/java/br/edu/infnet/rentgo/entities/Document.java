package br.edu.infnet.rentgo.entities;

public class Document {
    private long id;
    private String rg;
    private String cpf;
    private String cnh;

    public Document() {
    }

    public Document(String rg, String cpf, String cnh) {
        this.rg = rg;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Documento {" +
                "RG: " + rg + " - " +
                "CPF: " + cpf + " - " +
                "CNH: " + cnh +
                '}';
    }
}
