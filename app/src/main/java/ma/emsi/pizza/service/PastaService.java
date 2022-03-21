package ma.emsi.pizza.service;

import java.util.ArrayList;
import java.util.List;


import ma.emsi.pizza.beans.Pasta;
import ma.emsi.pizza.dao.IDao;

public class PastaService implements IDao<Pasta> {
    private List <Pasta> Pastas;
    private static PastaService instance;

    private PastaService() {
        this.Pastas = new ArrayList<>();
    }

    public static PastaService getInstance() {
        if(instance == null)
            instance =  new PastaService();
        return instance;
    }

    @Override
    public boolean create(Pasta o) {
        return Pastas.add(o);
    }

    @Override
    public boolean update(Pasta o) {
        return false;
    }

    @Override
    public boolean delete(Pasta o) {
        return Pastas.remove(o);
    }

    @Override
    public Pasta findById(int id) {
        for(Pasta p  : Pastas){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public List<Pasta> findAll() {
        return Pastas;
    }
}
