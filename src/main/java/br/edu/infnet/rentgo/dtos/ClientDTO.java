package br.edu.infnet.rentgo.dtos;

public class ClientDTO {
    private int idForm;
    private String nameForm;
    private String telForm;
    private String rgForm;
    private String cpfForm;
    private String cnhForm;
    private String endForm;
    private String compForm;
    private String bairroForm;
    private String cidadeForm;
    private String estadoForm;
    private String cepForm;
    private boolean verifiedForm;
    private int credentialIdForm;
    private String credentialEmailForm;

    public ClientDTO() {
    }

    public ClientDTO(int idForm, String nameForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm) {
        this.idForm = idForm;
        this.nameForm = nameForm;
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

    public ClientDTO(int idForm, String nameForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm, int credentialIdForm) {
        this.idForm = idForm;
        this.nameForm = nameForm;
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
        this.credentialIdForm = credentialIdForm;
    }

    public ClientDTO(int idForm, String nameForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm, int credentialIdForm, String credentialEmailForm) {
        this.idForm = idForm;
        this.nameForm = nameForm;
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
        this.credentialIdForm = credentialIdForm;
        this.credentialEmailForm = credentialEmailForm;
    }

    public ClientDTO(String nameForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm) {
        this.nameForm = nameForm;
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

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    public String getTelForm() {
        return telForm;
    }

    public void setTelForm(String telForm) {
        this.telForm = telForm;
    }

    public String getRgForm() {
        return rgForm;
    }

    public void setRgForm(String rgForm) {
        this.rgForm = rgForm;
    }

    public String getCpfForm() {
        return cpfForm;
    }

    public void setCpfForm(String cpfForm) {
        this.cpfForm = cpfForm;
    }

    public String getCnhForm() {
        return cnhForm;
    }

    public void setCnhForm(String cnhForm) {
        this.cnhForm = cnhForm;
    }

    public String getEndForm() {
        return endForm;
    }

    public void setEndForm(String endForm) {
        this.endForm = endForm;
    }

    public String getCompForm() {
        return compForm;
    }

    public void setCompForm(String compForm) {
        this.compForm = compForm;
    }

    public String getBairroForm() {
        return bairroForm;
    }

    public void setBairroForm(String bairroForm) {
        this.bairroForm = bairroForm;
    }

    public String getCidadeForm() {
        return cidadeForm;
    }

    public void setCidadeForm(String cidadeForm) {
        this.cidadeForm = cidadeForm;
    }

    public String getEstadoForm() {
        return estadoForm;
    }

    public void setEstadoForm(String estadoForm) {
        this.estadoForm = estadoForm;
    }

    public String getCepForm() {
        return cepForm;
    }

    public void setCepForm(String cepForm) {
        this.cepForm = cepForm;
    }

    public boolean isVerifiedForm() {
        return verifiedForm;
    }

    public void setVerifiedForm(boolean verifiedForm) {
        this.verifiedForm = verifiedForm;
    }

    public int getCredentialIdForm() {
        return credentialIdForm;
    }

    public void setCredentialIdForm(int credentialIdForm) {
        this.credentialIdForm = credentialIdForm;
    }

    public String getCredentialEmailForm() {
        return credentialEmailForm;
    }

    public void setCredentialEmailForm(String credentialEmailForm) {
        this.credentialEmailForm = credentialEmailForm;
    }
}
