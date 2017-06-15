package com.aviva.ezflow.rules.model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 7511286108030310528L;

    private String productCd;
    private String productDesc;

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productCd != null ? !productCd.equals(product.productCd) : product.productCd != null) return false;
        return productDesc != null ? productDesc.equals(product.productDesc) : product.productDesc == null;
    }

    @Override
    public int hashCode() {
        int result = productCd != null ? productCd.hashCode() : 0;
        result = 31 * result + (productDesc != null ? productDesc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCd='" + productCd + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
