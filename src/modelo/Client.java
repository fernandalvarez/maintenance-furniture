package modelo;
    /**
     * @author Fernanda Alvarez
     * @since 1.0
     */
public class Client {
    private int id_client;
    private String name;
    private String addres;
    private int phone;
    // sobre escribir el constructor

    public Client() {
        
    }

    public Client(int id_client,String name,String addres,int phone){
        setId_client(id_client);
        setName(name); 
        setAddres(addres);
        setPhone(phone);
    }

    // method get 
    public int getId_client(){
        return id_client;
    }

    public String getName(){
        return name;
    }

    public String getAddres(){
        return addres;
    }

    public int getPhone(){
        return phone;
    }

    // // method set

    public void setId_client(int id_client){
        this.id_client = id_client;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddres(String addres){
        this.addres = addres;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Client:"+
                "id_cliente: "+getId_client()+
                "name: "+getName()+
                "addres: "+getAddres()+
                "phone: "+getPhone();
    }
}
