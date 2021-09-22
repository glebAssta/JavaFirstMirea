package ru.mirea.task5.furniture;

import ru.mirea.task5.furniture.Furniture;

class Table extends Furniture {
    private String form;

    public Table (String material, int amount, String form){
        super(material, amount);
        this.form = form;
    }
    public void TToString(){
        System.out.println("Material of Chair is "+super.getMaterial()+", amount = "+ super.getAmount()+", form of table is "+ form);
    }
}