package isig.example.glodi.syncmysql;

public class Contact {

    private String Name;
    private int Sync_status;


    Contact(String Name,int Sysnc_status)
    {
        this.setName(Name);
        this.setSync_status(Sysnc_status);
    }

    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }

    public int getSync_status(){
        return Sync_status;
    }

    public void setSync_status(int sync_status){
        Sync_status=sync_status;
    }

}
