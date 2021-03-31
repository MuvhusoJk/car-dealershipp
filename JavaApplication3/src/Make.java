/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jake
 */
public class Make {
    String brandName;
    String countryOforigin;
    
    public Make(){
        this.brandName = "Unknown";
        this.countryOforigin = "Unknown";
    }
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
    public String getCountryOforigin(){
        return countryOforigin;
    }
    public void setCountryOfOrigin(String countryOforigin){
        this.countryOforigin = countryOforigin;
    }
}
