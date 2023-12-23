public class eleve {
    private String numeroEtudiant;
    private String prenomEleve;
    private String nomEleve;
    private String dateNaissanceEleve;
    public String classeEleve;

    // constructeur
    public eleve(String numeroEtudiant ,String prenomEleve, String nomEleve, String dateNaissanceEleve, String classeEleve) {
        System.out.println("bonjour c'est moi l'eleve repondant au nom "+prenomEleve +"  "+ nomEleve+"en classe de"+classeEleve);
    }

    // create getter and setter
    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    // create getter and setter
    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }

    // create getter and setter
    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    // create getter and setter
    public String getClasseEleve() {
        return classeEleve;
    }

    public void setClasseEleve(String classeEleve) {
        this.classeEleve = classeEleve;
    }

    // create getter and setter
    public String getDateNaissanceEleve() {
        return dateNaissanceEleve;
    }

    public void setDateNaissanceEleve(String dateNaissanceEleve) {
        this.dateNaissanceEleve = dateNaissanceEleve;
    }
    //fonction main

    /*public static void main(String[] args) {
        System.out.println("bonjour");
        eleve eleve = new eleve("N03020219876","arphan","bodian","18/10/2002","licene3lgsi");
        
    }*/

}
