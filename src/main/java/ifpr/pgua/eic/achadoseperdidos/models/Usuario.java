package ifpr.pgua.eic.achadoseperdidos.models;

public class Usuario {
    
    private int id;
    private String email;
    private String senha;
    private String nome;
    private String contato;
    private String endereco;

    public Usuario(String nome, String contato, String endereco, String email, String senha) {
        this.nome = nome;
        this.contato = contato;
        this.endereco =endereco;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String getEndereço(){
        return endereco;

    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

  
    public String toString(){
        return nome+" ("+id+")";
    }
    

    
}
