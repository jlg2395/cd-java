package com.campusdual.exercisespoo.exercise11;

public abstract class Merchandise {
    // Se puede poner:   protected String name, uniqueId, responsibleId;
    protected String name;
    protected String uniqueId;
    protected String reponsibleId;
    protected int zone;
    protected String area;
    protected String shelf;
    protected int quantity;
//    CONSTRUCTORES, siempre hay un constructor vacio pr defeto

    public Merchandise(String name, String uniqueId, String reponsibleId) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.reponsibleId = reponsibleId;
    }

    public Merchandise(String name, String uniqueId, String reponsibleId, int zone, String area, String shelf,
                       int quantity) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.reponsibleId = reponsibleId;
        this.zone = zone;
        this.area = area;
        this.shelf = shelf;
        this.quantity = quantity;
    }

    //    GETTERS Y SETTERS


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getReponsibleId() {
        return reponsibleId;
    }

    public void setReponsibleId(String reponsibleId) {
        this.reponsibleId = reponsibleId;
    }

    public int getZone() {
        return this.zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getLocation(){
        StringBuilder builder= new StringBuilder();
        builder.append("Z - ");
        builder.append(this.getZone());
        builder.append(" A- ");
        builder.append(this.getArea());
        builder.append(" E - ");
        builder.append(this.getShelf());

        return builder.toString();
    }
    public abstract  Object getSpecificData();
}
