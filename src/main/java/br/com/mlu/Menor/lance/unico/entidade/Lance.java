package br.com.mlu.Menor.lance.unico.entidade;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
public class Lance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Double valor;

    private LocalDateTime horaDoLance = LocalDateTime.now(ZoneId.of("GMT"));

    @Deprecated
    public Lance() {
    }

    public Lance(String email, Double valor) {
        this.email = email;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getHoraDoLance() {
        return horaDoLance;
    }
}
