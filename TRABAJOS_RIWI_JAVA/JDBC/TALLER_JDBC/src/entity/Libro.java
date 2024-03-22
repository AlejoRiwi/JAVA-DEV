package entity;

import java.util.Date;

public class Libro {
    private int id;
    private String title;
    private String age;
    private double price;

    private int idAutor;

    private Autor objAutor;

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public Autor getObjAutor() {
        return objAutor;
    }

    public void setObjAutor(Autor objAutor) {
        this.objAutor = objAutor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + age +
                ", price=" + price +
                ", idAutor=" + idAutor +
                ", objAutor=" + objAutor.getName() +
                '}';
    }
}
