package com.nath.sma.service;

import com.nath.sma.entity.Classe;

public interface ClasseService{

    Iterable<Classe> getAllClasse();

    void deleteClasse(Classe classe);

    void saveClasse(Classe classe);

    Classe getClasseById(long id);


	
}