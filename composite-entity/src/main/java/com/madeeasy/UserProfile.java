package com.madeeasy;

// Composite Entity: UserProfile
public class UserProfile {
    private ProfileName name;
    private ProfileEmail email;
    private ProfilePassword password;

    public void setProfile(String name, String email, String password) {
        this.name = new ProfileName(name);
        this.email = new ProfileEmail(email);
        this.password = new ProfilePassword(password);
    }

    public String getName() {
        return name.getName();
    }

    public String getEmail() {
        return email.getEmail();
    }

    public String getPassword() {
        return password.getPassword();
    }
}
