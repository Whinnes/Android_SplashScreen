package com.awcode.splashscreen;

public class CategoriesItem {

    String title, offer;
    int productItem, productOffer;

    public CategoriesItem() {
    }

    public CategoriesItem(String title, String offer, int productItem, int productOffer) {
        this.title = title;
        this.offer = offer;
        this.productItem = productItem;
        this.productOffer = productOffer;
    }

    public String getTitle() {
        return title;
    }

    public String getOffer() {
        return offer;
    }

    public int getProductItem() {
        return productItem;
    }

    public int getProductOffer() {
        return productOffer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setProductItem(int productItem) {
        this.productItem = productItem;
    }

    public void setProductOffer(int productOffer) {
        this.productOffer = productOffer;
    }
}
