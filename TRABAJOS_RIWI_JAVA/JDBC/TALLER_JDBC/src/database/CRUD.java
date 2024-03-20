package database;

public interface CRUD {

    // Autors
    public Autor insert (Autor object);

    public list<Autor> findAll();

    public Autor findById(int id);

    public Autor findAutor(Autor autor);

    public boolean update(Autor autor);
    public boolean delete(Autor autor)
}
