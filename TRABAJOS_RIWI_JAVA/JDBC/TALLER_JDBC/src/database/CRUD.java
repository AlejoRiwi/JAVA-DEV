package database;

import java.util.List;
public interface CRUD {

    // Autors
    public Object insert (Object object); // CREAR Listo

    public List<Object> findAll(); // LEER Listo

    public Object findById(int id); // BUSCAR POR ID listo

    public Object findAutor(Object object); // BUSCAR POR TITULO O AUTOR listo

    public boolean update(Object autor); // ACTUALIZAR x ID listo
    public boolean delete(Object autor); // DELETE Listo


}
