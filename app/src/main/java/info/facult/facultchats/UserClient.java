package info.facult.facultchats;

import android.app.Application;

import info.facult.facultchats.osnova.models.Users;



public class UserClient extends Application {

    private Users user = null;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}
