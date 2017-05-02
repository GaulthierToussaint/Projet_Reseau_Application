package data;

/**
 * Classe représentant un domaine d'e-mail
 */
public enum DomaineEmail {
    GMAIL("gmail"),
    SFR("sfr"),
    ETUUNICE("etu.unice"),
    LIVE("live");

    private final String domaine;

    DomaineEmail(String domaine){
        this.domaine = domaine;
    }

    @Override
    public String toString(){
        return domaine;
    }

}
