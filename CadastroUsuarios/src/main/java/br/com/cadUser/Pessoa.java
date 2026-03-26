package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pessoa") // Nome que será chamado no XHTML
@RequestScoped // Define que os dados duram apenas uma requisição
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    // Atributos privados conforme pedido no passo 11
    private String nome;
    private List<String> listaNomes = new ArrayList<>();

    // Construtor padrão
    public Pessoa() {
    }

    /**
     * Método para adicionar o nome atual à lista.
     * Este método será chamado pelo h:commandButton do XHTML.
     */
    public void adicionar() {
        if (this.nome != null && !this.nome.trim().isEmpty()) {
            this.listaNomes.add(this.nome);
            // Opcional: limpar o campo nome após adicionar
            // this.nome = ""; 
        }
    }

    // Getters e Setters obrigatórios para o JSF (passo 11)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(List<String> listaNomes) {
        this.listaNomes = listaNomes;
    }
}