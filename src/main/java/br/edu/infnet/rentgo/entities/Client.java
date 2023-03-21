package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String telefone;
    private boolean isVerified;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "document_id", referencedColumnName = "id")
    private Document document;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Client(Integer id, String name, String email, String telefone, boolean isVerified, Document document, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.isVerified = isVerified;
        this.document = document;
        this.address = address;
    }

    public Client(ClientDTO clientDTO){
        name = clientDTO.nameForm;
        email = clientDTO.emailForm;
        telefone = clientDTO.telForm;
        isVerified = clientDTO.verifiedForm;
        document = new Document(clientDTO.rgForm, clientDTO.cpfForm, clientDTO.cnhForm);
        address = new Address(clientDTO.cepForm, clientDTO.endForm, clientDTO.compForm, clientDTO.bairroForm,
                clientDTO.cidadeForm, clientDTO.estadoForm);
    }


    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CLIENTE {" +
                "NOME='" + name + '\'' +
                ", EMAIL='" + email + '\'' +
                ", TELEFONE='" + telefone + '\'' +
                 ", " + document +
                ", " + address +
                '}';
    }
}
