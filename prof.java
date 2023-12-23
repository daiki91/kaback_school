public class prof {
    private String prenomProf;
    private String nomProf;
    private String nommatiere;
    private String niveauEnseigner;

    public prof(String prenomProf,String nomProf,String nommatiere,String niveauEnseigner){
        System.out.println("bonjour c'est moi l'eleve repondant au nom "+nomProf +"  "+ nommatiere+"en classe de"+niveauEnseigner);
    }
     // create getter and setter
    public String getNiveauEnseigner() {
        return niveauEnseigner;
    }
    public void setNiveauEnseigner(String niveauEnseigner) {
        this.niveauEnseigner = niveauEnseigner;
    }

     // create getter and setter
    public String getNomProf() {
        return nomProf;
    }
    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

     // create getter and setter
    public String getNommatiere() {
        return nommatiere;
    }
    public void setNommatiere(String nommatiere) {
        this.nommatiere = nommatiere;
    }
    
     // create getter and setter
    public String getPrenomProf() {
        return prenomProf;
    }
    
    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }
}
