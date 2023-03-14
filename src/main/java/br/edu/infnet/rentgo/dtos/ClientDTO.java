package br.edu.infnet.rentgo.dtos;

public class ClientDTO {
    public String nameForm;
    public String emailForm;
    public String telForm;
    public String rgForm;
    public String cpfForm;
    public String cnhForm;
    public String endForm;
    public String compForm;
    public String bairroForm;
    public String cidadeForm;
    public String estadoForm;
    public String cepForm;
    public boolean verifiedForm;

    public ClientDTO(String nameForm, String emailForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm) {
        this.nameForm = nameForm;
        this.emailForm = emailForm;
        this.telForm = telForm;
        this.rgForm = rgForm;
        this.cpfForm = cpfForm;
        this.cnhForm = cnhForm;
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
        this.verifiedForm = verifiedForm;
    }
}
