package firstexo;

import java.util.Objects;
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    public Etudiant(String nom,String prenom,int id){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
        
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public void setprenom(String prenom){
        this.prenom=prenom;
    }
    @Override
    public String toString(){
        return "nom: "+nom+" prenom: "+prenom+" id: "+id; 
    }
    @Override
    public boolean equals(Object Et){
        if (!(Et instanceof Etudiant)) return false;
        Etudiant e=(Etudiant) Et;

        return  id==e.id;

    }
    @Override 
    public int hashCode(){
        return Objects.hash(id);

    }
    


    

}
