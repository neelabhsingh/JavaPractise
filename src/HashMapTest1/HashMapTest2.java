/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapTest1;

import java.util.*;

/**
 *
 * @author Neelabh
 */
class Country{
    String name;
    long population;
    public Country(String name, long population){
        super();
        this.name=name;
        this.population=population;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public long getPopulation(){
        return this.population;
    }
    public void setPopulation(long population){
        this.population=population;
    }
    @Override
    public int hashCode(){
        if(this.name.length()%2==2)
            return 31;
        else
            return 95;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Country){
            Country other=(Country) obj;
            if(name.equalsIgnoreCase(other.name))
                return true;
        }
        return false;
    }
}
public class HashMapTest2 {
    public static void main(String [] args){
        Country india=new Country("India", 1000);
        Country japan=new Country("Japan", 10000);
        Country france=new Country("France",2000);
        Country russia=new Country("Russia", 20000);
        HashMap<Country, String> countryCapitalMap=new HashMap<Country, String>();
        countryCapitalMap.put(india," Delhi");
        countryCapitalMap.put(japan, " Tokyo");
        countryCapitalMap.put(russia," Moscow");
        countryCapitalMap.put(france,"Paris");
        Set<Country> countryCapitalSet=countryCapitalMap.keySet();
        Iterator countryCapitalIter=countryCapitalSet.iterator();
        while(countryCapitalIter.hasNext()){
            Country countryObj=(Country) countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+""+capital);
        }
        
    }
}
