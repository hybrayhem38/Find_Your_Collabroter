package software.ilhan.com.realtimemangalaoyunu;

public class Levha {

    private String baslik;
    private String gereksinim;
    private String username;

    public Levha(String baslik, String gereksinim, String username) {
        this.baslik = baslik;
        this.gereksinim = gereksinim;
        this.username = username;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getGereksinim() {
        return gereksinim;
    }

    public void setGereksinim(String gereksinim) {
        this.gereksinim = gereksinim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
