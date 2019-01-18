package info.facult.facultchats.osnova.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class UserLocations implements Parcelable{

    private Users user;
    private GeoPoint geo_point;
    private @ServerTimestamp Date timestamp;

    public UserLocations(Users user, GeoPoint geo_point, Date timestamp) {
        this.user = user;
        this.geo_point = geo_point;
        this.timestamp = timestamp;
    }

    public UserLocations() {

    }

    protected UserLocations(Parcel in) {
        user = in.readParcelable(Users.class.getClassLoader());
    }

    public static final Creator<UserLocations> CREATOR = new Creator<UserLocations>() {
        @Override
        public UserLocations createFromParcel(Parcel in) {
            return new UserLocations(in);
        }

        @Override
        public UserLocations[] newArray(int size) {
            return new UserLocations[size];
        }
    };

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public GeoPoint getGeo_point() {
        return geo_point;
    }

    public void setGeo_point(GeoPoint geo_point) {
        this.geo_point = geo_point;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserLocation{" +
                "user=" + user +
                ", geo_point=" + geo_point +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(user, flags);
    }
}
