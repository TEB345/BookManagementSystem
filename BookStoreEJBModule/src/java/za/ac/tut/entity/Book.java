/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long isbn;
    private String title;
    @Column(name="AUTHOR_NAME")
    private String name;
    @Column(name="AUTHOR_SURNAME")
    private String surname;
    @Temporal(TemporalType.DATE)
    @Column(name="PUBLICATION_DATE")
    private Date  pb;
    private double price;
    private int stock;

    public Book() {
    }

    public Book(Long isbn, String title, String name, String surname, Date pb, double price, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.pb = pb;
        this.price = price;
        this.stock = stock;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getPb() {
        return pb;
    }

    public void setPb(Date pb) {
        this.pb = pb;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entitu.Book[ id=" + isbn + " ]";
    }
    
}
