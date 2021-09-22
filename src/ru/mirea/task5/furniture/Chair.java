package ru.mirea.task5.furniture;

class Chair extends Furniture {
    private String SeatMaterial;

    public Chair(String material, int amount, String SeatMaterial){
        super(material, amount);
        this.SeatMaterial = SeatMaterial;
    }

    public void ChToString(){
        System.out.println("Material of Chair is "+super.getMaterial()+", amount = "+ super.getAmount()+", material of seat is "+SeatMaterial);
    }
}