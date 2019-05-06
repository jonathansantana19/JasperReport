
package com.mkdika.jasperexample.entity;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class ConnString {
    
    private String url;
    private String driver;
    private String username;
    private String password;
    
    public ConnString() {
        
    }

    public ConnString(String url, String driver, String username, String password) {
        this.url = url;
        this.driver = driver;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
