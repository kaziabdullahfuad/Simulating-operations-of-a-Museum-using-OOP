
package fxmlapplicationpkg;

import java.io.Serializable;
import java.time.LocalDate;


public class MuseumObjects implements Serializable{
    
    private String name;
    private String id;
    private String category;
    private String storage;
    private LocalDate addedDate;

    public MuseumObjects() {
    }

    public MuseumObjects(String name, String id, String category, String storage, LocalDate addedDate) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.storage = storage;
        this.addedDate = addedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "MuseumObjects{" + "name=" + name + ", id=" + id + ", category=" + category + ", storage=" + storage + ", addedDate=" + addedDate + '}';
    }

   
    
}
