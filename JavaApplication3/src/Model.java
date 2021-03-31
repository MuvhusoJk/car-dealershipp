/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jake
 */
public class Model extends Make{
    String modelName;
    int yearOfmanufacture;
    
    public Model(){
        this.modelName = "unknown";
        this.yearOfmanufacture = -1;
    }
    public String getModelName(){
        return modelName;
    }
    public void setModelName( String modelName){
        this.modelName = modelName;
    }
    public int getYearOfManufacture(){
        return yearOfmanufacture;
    }
    public void setYearOfmanufacture(int yearOfmanufacture){
    this.yearOfmanufacture = yearOfmanufacture;        
    }
}
