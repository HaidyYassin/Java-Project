/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author DELL
 */
public class PlayerData {
    
    private int id;
    private String name;
    private String email;
    private String pass;
    private int avatar=1;
    private int score =0;
    private boolean isOnline=false;

    public PlayerData() {
        
    }
    
    public PlayerData(int id, String name, String email, String pass, int avatar, int score,boolean isOnline) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.avatar = avatar;
        this.score = score;
        this.isOnline=isOnline;
    }
     public PlayerData(int id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        
    }

    public PlayerData(int id, String name, String email, String pass, int avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }
    
    
    
}
