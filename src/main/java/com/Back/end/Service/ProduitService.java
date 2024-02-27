package com.Back.end.Service;
import com.Back.end.Emtity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Back.end.DAO.ProduitDaoSpringData;
import java.util.List;
import java.util.Map
@Service
public class ProduitService {
    private final ProduitDaoSpringData produitDaoSpringData;

    @Autowired
    public ProduitService(ProduitDaoSpringData produitDaoSpringData) {
        super();
        this.produitDaoSpringData = produitDaoSpringData;

    }
    public void updateAllStock() {
        List<Produit> allProducts = produitDaoSpringData.getAllProducts();
        for(Produit produit: allProducts) {
            if(produit.getUnitsInStock() < 500) {
                produitDaoSpringData.updateStock(produit.getId(), produit.getUnitsInStock()+1000);
            }
            public List<Produit> getAllProducts() {
                return produitDaoSpringData.getAllProducts();
            }
        }
    }
    public List<Produit> getProductsByCategory(String category) {
        return produitDaoSpringData.getProductsByCategory(category);
    }


    public List<Produit> getProductsByFilter(Map<String, List<String>> filterParams) {
        return produitDaoSpringData.getProductsByFilter(filterParams);
    }


    public Produit getProductById(String productID) {
        return produitDaoSpringData.getProductById(productID);
    }


    public List<Product> filterProduct(String categorie, Map<String, String> price_band, String brand) {
        return productRepository.filterProducts(categorie, price_band, brand);
    }


    public void addProduct(Produit product) {
        produitDaoSpringData.addProduct(product);
    }
}
