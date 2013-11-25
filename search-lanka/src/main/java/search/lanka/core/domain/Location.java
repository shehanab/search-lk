package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Id;

/**
 *
 */
public class Location {

    public static String VENDOR_ID = "vendor_id";
    public static String LOCATION_ID = "location_id";

    @Id
    private String location_id;
    private String location;
    private String country;
    private String state_province;
    private String city;
    private String zip_code;
    private String latitude;
    private String longitude;
    private String address;
    private String vendor_id;

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VendorPost [location_id=");
        builder.append(location_id);
        builder.append(", location=");
        builder.append(location);
        builder.append(", country=");
        builder.append(country);
        builder.append("city=");
        builder.append(city);
        builder.append(", state_province=");
        builder.append(state_province);
        builder.append("zip_code=");
        builder.append(zip_code);
        builder.append(", latitude=");
        builder.append(latitude);
        builder.append(", longitude=");
        builder.append(longitude);
        builder.append("address=");
        builder.append(address);
        builder.append("]");
        return builder.toString();
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }
}
