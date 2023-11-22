package ifpr.pgua.eic.achadoseperdidos.models;

public class ObjetoPerdido {
   
    private int id;
    private String descricao;
    
    
    public ObjetoPerdido(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String descricao) {
        this.descricao = descricao;
    }

   

}
