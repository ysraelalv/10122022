package com.yalva.serviciocliente.models.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratedColumn;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumeroDoc;
    private Long TipoDoc;
    private String Nombre1;
    private String Nombre2;
    private String ApePat;
    private String ApeMat;
    @Column(name = "FecNac")
    @Temporal(TemporalType.DATE)
    private Date FecNac;

    public Long getNumeroDoc() {
        return NumeroDoc;
    }

    public void setNumeroDoc(Long numeroDoc) {
        NumeroDoc = numeroDoc;
    }

    public Long getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(Long tipoDoc) {
        TipoDoc = tipoDoc;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String nombre1) {
        Nombre1 = nombre1;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String nombre2) {
        Nombre2 = nombre2;
    }

    public String getApePat() {
        return ApePat;
    }

    public void setApePat(String apePat) {
        ApePat = apePat;
    }

    public String getApeMat() {
        return ApeMat;
    }

    public void setApeMat(String apeMat) {
        ApeMat = apeMat;
    }

    public Date getFecNac() {
        return FecNac;
    }

    public void setFecNac(Date fecNac) {
        FecNac = fecNac;
    }
}
