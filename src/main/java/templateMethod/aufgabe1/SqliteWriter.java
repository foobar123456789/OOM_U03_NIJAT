package templateMethod.aufgabe1;


import java.sql.*;

public class SqliteWriter {
    private Connection conn;
    private Statement stmt ;
    private PreparedStatement pstmt ;
    private ResultSet rs ;

    private String fileName;
    private boolean firstTime ;

    public SqliteWriter(String fileName, boolean firstTime) {
        this.fileName = fileName;
        this.firstTime = firstTime;
    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+ fileName);
            stmt = conn.createStatement();
        } catch(Exception ex) {
           ex.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(stmt!= null) stmt.close();
            if(conn != null) conn.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void createTable() {
        firstTime = false ;
        /*
            private String name;
    private int maxWert;
    private int minWert;
    private int eroeffnungsWert;
    private  int schlusswert;
         */
         String str = "create table datenobjekt (" +
                 "name text not null, " +
                 "maxWert int not null, " +
                 "minWert int not null , " +
                 "ereoffnungsWert int not null, " +
                 "schlusswert int not null)";
        try {
                stmt.execute(str);
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public void insertEntry(DatenObjekt obj) {
        if(firstTime) createTable();
        String name = obj.getName();
        int maxWert = obj.getMaxWert();
        int minWert = obj.getMinWert();
        int eroeffnungsWert = obj.getEroeffnungsWert();
        int schlusswert = obj.getSchlusswert();
        String str = "insert into datenobjekt values " +
                "(\""+ name + "\","+ maxWert + ","+ minWert+ ","+ eroeffnungsWert + ","+ schlusswert+ ")";
        try {
            stmt.execute(str);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
