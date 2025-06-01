package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    // Criar um SimpleDateFormat para o padrão brasileiro
    SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    //Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
    @Override
    public String priceTag(){
        String dataFormatada = formatoBrasileiro.format(manufactureDate);
        return getName() + " $ " + String.format("%.2f", Double.parseDouble(getPrice().toString())) + " (Manufacture date: " + dataFormatada + ")";
    }
}
