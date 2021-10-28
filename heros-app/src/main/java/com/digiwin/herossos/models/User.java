package com.digiwin.herossos.models;

import javax.persistence.*;
import java.time.*;
import com.digiwin.herossos.jpa.enums.*;

@Entity
public class User {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="lastName", columnDefinition="varchar(50) NOT NULL")
    private String lastName;

    @Column(name="firstName", columnDefinition="varchar(50) NOT NULL")
    private String firstName;

    @Column(name="civility", columnDefinition="enum('MONSIEUR', 'MADAME', 'AUTRE')")
    @Enumerated(EnumType.STRING)
    private Civility civility;

    @Column(name="emailAddress", columnDefinition="varchar(50) NOT NULL")
    private String emailAddress;

    @Column(name="password", columnDefinition="varchar(255) NOT NULL")
    private String password;

    @Column(name="createdAt", columnDefinition="DATETIME")
    private OffsetDateTime createdAt;

    @Column(name="latestAt", columnDefinition="DATETIME")
    private OffsetDateTime latestAt;

    @Column(name="actived", columnDefinition="boolean default false")
    private Boolean actived;

    @Column(name="birthday", columnDefinition="DATETIME")
    private OffsetDateTime birthday;

    @Column(name="street", columnDefinition="varchar(255)")
    private String street;

    @Column(name="city", columnDefinition="varchar(100)")
    private String city;

    @Column(name="postalCode", columnDefinition="varchar(8)")
    private String postalCode;

    @Column(name="country", columnDefinition="enum('FRANCE', 'ANGLETERRE', 'ETATS_UNIS', 'CANADA')")
    @Enumerated(EnumType.STRING)
    private Country country;

    @Column(name="phoneNumber", columnDefinition="varchar(12)")
    private String phoneNumber;

    @Column(name="roles", columnDefinition="enum('ROLE_CITOYEN', 'ROLE_SUPER_HEROS', 'ROLE_ADMINISTRATEUR') default 'ROLE_CITOYEN' NOT NULL")
    @Enumerated(EnumType.STRING)
    private Roles roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Civility getCivility() {
        return civility;
    }

    public void setCivility(Civility civility) {
        this.civility = civility;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getLatestAt() {
        return latestAt;
    }

    public void setLatestAt(OffsetDateTime latestAt) {
        this.latestAt = latestAt;
    }

    public Boolean getActived() {
        return actived;
    }

    public void setActived(Boolean actived) {
        this.actived = actived;
    }

    public OffsetDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(OffsetDateTime birthday) {
        this.birthday = birthday;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}