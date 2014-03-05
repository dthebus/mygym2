/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2.model.staff;

/**
 *
 * @author student
 */
public final class ProductSalesStaff implements Employees{
    private int id;
    private String name;
    
    public int getID() {
    return id;    
    }
    public String getName() {
        return name;
    }

   
   
    private ProductSalesStaff(Builder builder) {
       id=builder.id;
        name= builder.name;
      }
    public static class Builder{
        private int id;
        private String name;

        public Builder(int value) {
            id=value;
            
        }

        public Builder name(String name){
             this.name = name;
             return this;
            
        }
         public ProductSalesStaff build(){
            return new ProductSalesStaff(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductSalesStaff other = (ProductSalesStaff) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
