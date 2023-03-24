package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String telefone;
    private boolean isVerified;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "document_id", referencedColumnName = "id")
    private Document document;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "credentialUser_id", referencedColumnName = "id")
    private CredentialUser credentialUser;

    @OneToMany
    @JoinTable(name = "tb_client_booking",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "booking_id"))
    private Set<Booking> bookings = new HashSet<>();


    public Client(Integer id, String name, String telefone, boolean isVerified, Document document, Address address, CredentialUser credentialUser) {
        this.id = id;
        this.name = name;
        this.telefone = telefone;
        this.isVerified = isVerified;
        this.document = document;
        this.address = address;
        this.credentialUser = credentialUser;
    }

    public Client(ClientDTO clientDTO){
        name = clientDTO.getNameForm();
        telefone = clientDTO.getTelForm();
        isVerified = clientDTO.isVerifiedForm();
        document = new Document(clientDTO.getRgForm(), clientDTO.getCpfForm(), clientDTO.getCnhForm());
        address = new Address(clientDTO.getCepForm(), clientDTO.getEndForm(), clientDTO.getCompForm(), clientDTO.getCompForm(),
                clientDTO.getCidadeForm(), clientDTO.getEstadoForm());
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

    public CredentialUser getCredentialUser() {
        return credentialUser;
    }

    public void setCredentialUser(CredentialUser credentialUser) {
        this.credentialUser = credentialUser;
    }

    @Override
    public String toString() {
        return "CLIENTE {" +
                "NOME='" + name + '\'' +
                ", TELEFONE='" + telefone + '\'' +
                 ", " + document +
                ", " + address +
                '}';
    }
}
