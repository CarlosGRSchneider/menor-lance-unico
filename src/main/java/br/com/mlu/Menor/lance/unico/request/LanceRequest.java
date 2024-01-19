package br.com.mlu.Menor.lance.unico.request;

import br.com.mlu.Menor.lance.unico.entidade.Lance;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class LanceRequest {

    @NotBlank
    @Email
    private String email;

    @NotNull
    @Positive
    private double valor;

    public Lance toModel() {
        return new Lance(email, valor);
    }

    public String getEmail() {
        return email;
    }

    public double getValor() {
        return valor;
    }
}
