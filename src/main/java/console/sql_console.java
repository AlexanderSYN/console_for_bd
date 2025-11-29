package console;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import static DB.util.get_connection;

public class sql_console  {

    private static Scanner in = new Scanner(System.in);
    private static boolean isRun = false;

    public static void sql_mode(boolean isRun) {
        while (isRun) {
            try {
                System.out.println("SQL MODE (please enter sql query): ");
                String sql_query = in.nextLine();

                if (sql_query.equals("ex") || sql_query.equals("exit")) {
                    isRun = false;
                    break;
                }

                Connection con = get_connection();
                Statement statement = con.createStatement();

                ResultSet resultSet = statement.executeQuery(sql_query);
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.println(metaData.getColumnName(i) + " - " + resultSet.getString(i) + "\t");
                    }
                    System.out.println("\n");
                }

            } catch (Exception e){
                System.err.println("ERROR: " + e);
            }
        }

        System.out.println("BYE");
    }

}
