package modelo;

import java.lang.reflect.Constructor;

/**
 * Materials
 */
public class Materials {
    private int idMaterials;
    private String nameMaterials;
    private String typeMaterials;
    private int value;

    public Materials(){

    }

    public Materials(int idMaterials,String nameMaterials,String typeMaterials,int value){
        setIdMaterials(idMaterials);
        setNameMaterials(nameMaterials);
        setTypeMaterials(typeMaterials);
        setValue(value);
    }

    public int getIdMaterials(){
        return idMaterials;
    }

    public String getNameMaterials(){
        return nameMaterials;
    }

    public String getTypeMaterials(){
        return typeMaterials;
    }

    public int getValue(){
        return value;
    }

    public void setIdMaterials(int idMaterials){
        this.idMaterials = idMaterials;
    }

    public void setNameMaterials(String nameMaterials){
        this.nameMaterials= nameMaterials;
    }

    public void setTypeMaterials(String typeMaterials){
        this.typeMaterials = typeMaterials;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "Materials:"+
                "id Materials: "+getIdMaterials()+
                "Name Materials: "+getNameMaterials()+
                "Type Materials: "+getTypeMaterials()+
                "Values: "+getValue();
    }
}