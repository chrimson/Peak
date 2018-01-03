package jpam;

import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class PaEvt {

    private String conType;
    private String evtType;

	public PaEvt() {
        // Constructor
    }

    public String recObjEvt(ObjEvt objEvt) {
        conType = objEvt.conType;
        evtType = objEvt.evtType;

        savePaEvt();

        return "fff";
    }

    public String recAccEvt(AccEvt accEvt) {
        conType = accEvt.conType;
        evtType = accEvt.evtType;

        savePaEvt();

        return "fff";
    }
    
    private void savePaEvt()
    {
        System.out.format("%s %s%n", new String[]{conType, evtType});

        // SQL depending on private members
        String connectionUrl =
			"jdbc:sqlserver://10.110.106.10:1433;" +
		    "databaseName=peak;user=peak;password=peak;";
		
        try {
		    // Establish the connection.
			DriverManager.registerDriver(new SQLServerDriver());
			Connection con = DriverManager.getConnection(connectionUrl);
		
		    // Create and execute an SQL statement that returns some data.
		    String sql = "SELECT * FROM Aud";
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
		
		    // Iterate through the data in the result set and display it.
		    while (rs.next()) {
	            System.out.println(rs.getString(1) + " " + rs.getString(2));
		    }
        } catch (Exception e) { }
    }
}
