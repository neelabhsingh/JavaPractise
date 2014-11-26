/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImmutableTest;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public final class ImmutableClass {
    private final Integer immutableField1;
    private final String immutableField2;
    private final Date mutableField;
    private ImmutableClass(Integer fld1, String fld2, Date date){
        this.immutableField1=fld1;
        this.immutableField2=fld2;
        this.mutableField=new Date(date.getTime());
    }
    public static ImmutableClass createNewInstacne(Integer fld1,String fld2, Date date){
        return new ImmutableClass(fld1,fld2,date);
    }
    public Integer getImmutableField1(){
        return immutableField1;
    }
    public String getImmutableField2(){
        return immutableField2;
    }
    public Date getMutableField(){
        return new Date(mutableField.getTime());
    }
    @Override
    public String toString(){
        return immutableField1+"-"+immutableField2+"-"+mutableField;
    }
}
