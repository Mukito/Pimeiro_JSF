package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}