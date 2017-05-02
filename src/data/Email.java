package data;

/**
 * Classe représentant un e-mail;
 */
public class Email {
    private String email;
    private DomaineEmail domaine;
    private String comorfr;

    /**
     * Construit un objet de type e-mail avec :
     * @param part1 la première partie de l'e-mail (ex : toto@etu.unice.fr la première partie est toto)
     * @param domaine le domaine (gmail,etu.unice,sfr etc...)
     * @param comorfr com ou fr ou etc..;
     */
    Email(String part1,DomaineEmail domaine, String comorfr){
        this.email   = part1;
        this.domaine = domaine;
        this.comorfr = comorfr;
    }

    /**
     * Construit l'e-mail à partir d'un StringBuffer
     * @return StringBuffer e-mail
     */
    private StringBuffer buildEmail(){
        StringBuffer str = new StringBuffer();
        str.append(email);
        str.append("@");
        str.append(domaine.toString());
        str.append(".");
        str.append(comorfr);
        return str;
    }

    /**
     * Renvoit un String qui est l'e-mail
     * @return String e-mail
     */
    @Override
    public String toString(){
        return buildEmail().toString();
    }
}
