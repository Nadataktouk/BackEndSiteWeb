package com.Back.end.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Back.end.Emtity.Produit;

@Repository
public interface ProduitDaoSpringData  extends JpaRepository<Produit, Integer>{
}
