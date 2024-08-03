
import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/books";
        String uname = "postgres";
        String password = "secret";


        try (Connection con = DriverManager.getConnection(url, uname, password)) {
//            read(con);
//            create(con);
            createUsingPreparedStatement(con);
//            update(con);
//            delete(con);
//            read(con);
        } catch (SQLException e) {
            System.out.println("Sql Exception: " + e);
        } finally {
            System.out.println("Connection Closed");//close explicitly if its no closeable
        }

    }

    static void create(Connection con) throws SQLException{
        String query = "INSERT INTO books values (1, 'Maila Aanchal', 'Munshi Premchand', 1932, '9789350095261')";
        Statement st = con.createStatement();
        boolean status = st.execute(query);//ignore the return boolean value it can return anything
//        System.out.println(status);
    }

    //prepared statement is same but looks clean
    static void createUsingPreparedStatement(Connection con) throws  SQLException{
        String query = "INSERT INTO books values (?, ?, ?, ?, ?)";

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, 1000);
        st.setString(2, "Maila Aanchal");
        st.setString(3, "Munshi Premchand");
        st.setInt(4, 1932);
        st.setString(5, "9789350095261");
        st.execute();//ignore the return boolean value it can return anything
    }

    static void read(Connection con) throws SQLException {
        String query = "SELECT * FROM books LIMIT 5";//here books is table in books database

        System.out.println("Connection Success");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
//            rs.next(); //initially the pointer is at null we need to call next to put it to the first row of returned table
//            System.out.println(rs.getString(2));//can give col idx(1 based) or col name

        while (rs.next()) {
            System.out.printf("%d - %s - %s - %d - %s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));

        }
    }

    static void update(Connection con) throws SQLException{
        String query = "UPDATE books SET title='Godan' WHERE title='Godaan'";
        Statement st = con.createStatement();
        boolean status = st.execute(query);//ignore the return boolean value it can return anything
        System.out.println(status);
    }

    static void delete(Connection con) throws SQLException{
        String query = "DELETE FROM books WHERE isbn='9789350095261'";
        Statement st = con.createStatement();
        boolean status = st.execute(query);//ignore the return boolean value it can return anything
        System.out.println(status);
    }
}
