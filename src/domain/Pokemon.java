package domain;

public class Pokemon {

    private String name;
    private String number;
    private String description;

    public Pokemon(String name, String number, String description){
        this.name = name;
        this.number = number;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
