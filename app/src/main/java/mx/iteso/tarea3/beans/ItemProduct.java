package mx.iteso.tarea3.beans;

public class ItemProduct {
    private int image;
    private String title, store, location, phone, description;

    public ItemProduct() {
        setImage(0);
        setTitle("");
        setStore("");
        setLocation("");
        setPhone("");
        setDescription("");
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String val;
        val = String.format("[Image=%d, Title=%s, Store=%s, Location=%s, Phone=%s, Description=%s]",
                getImage(),getTitle(),getStore(),getLocation(),getPhone(),getDescription());
        return val;
    }
}
