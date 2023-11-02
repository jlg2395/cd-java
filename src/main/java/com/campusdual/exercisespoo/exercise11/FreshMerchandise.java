package com.campusdual.exercisespoo.exercise11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat();

    public FreshMerchandise(String name, String uniqueId, String reponsibleId) {
        super(name, uniqueId, reponsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String reponsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, reponsibleId, zone, area, shelf, quantity);
        this.expirationDate=expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidade: ");
        builder.append(sdf.format(this.getExpirationDate()));

        return builder.toString();
    }
    public void printSpecificDate(){
        System.out.println(this.getSpecificData());
    }

    // falta el main no tengo el constructor igual descargar cuando lo suba
}
