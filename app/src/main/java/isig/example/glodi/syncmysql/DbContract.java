package isig.example.glodi.syncmysql;

public class DbContract {

    public static final int SYNC_STATUS_OK=0;
    public  static final int SYNC_STATUS_FAILED=1;

    public static final String DATABASE_NAME="contactdb";
    public  static  final String TABLE_NAME="contactinfo";
    public  static  final String NAME="name";
    public  static final  String SYNC_STATUS="syncstatus";

    //Pour le server

    //public static  final String SERVER_URL="http://127.0.0.1:8887/syncdemo/syncinfo.php";

    public static  final String SERVER_URL="http://192.168.137.1:8087/syncdemo/syncinfo.php";
    public  static  final String UI_UPDATE_BROADCAST="isig.exemple.glodi.syncmysql.uiupdatebroadcast";

}
