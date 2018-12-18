package lc.ctco.firstweb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by yelena.pchelinceva on 12/18/2018.
 */
@RequestScoped
@Named
public class MyInfo {
    private String fullName;
    private String secret;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
