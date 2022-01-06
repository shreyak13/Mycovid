
public class dataholder {
    String name;
    String type;
    String bed;
    String address;
    String contact;
    String image;

    public dataholder() {
    }

    public dataholder(String name, String type, String bed, String address, String contact, String image) {
        this.name = name;
        this.type = type;
        this.bed = bed;
        this.address = address;
        this.contact = contact;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
