package exercice4;

public class Contact {
    public enum SocialNetwork {FACEBOOK, LINKED, TWITTER, INSTAGRAM};
    SocialNetwork reseau;
    String idContactReseau;
    public Contact(SocialNetwork sn, String id) {
        this.reseau = sn;
        this.idContactReseau = id;
    }

    public SocialNetwork getReseau() {
        return reseau;
    }

    public String getIdContactReseau() {
        return idContactReseau;
    }
    /**
     getters/setters
     **/
}
