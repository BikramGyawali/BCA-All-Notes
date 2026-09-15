using System;
using System.Data.SqlClient;

class Program
{
    static void Main()
    {
        string conString =
            @"Data Source=.\SQLEXPRESS;
              Initial Catalog=dotnet5thsem;
              Integrated Security=True";

        SqlConnection con = new SqlConnection(conString);

        // ---------------- INSERT ----------------
        string insertQuery =
            "INSERT INTO Users(Name, Password) VALUES (@name, @password)";

        SqlCommand insertCmd = new SqlCommand(insertQuery, con);

        insertCmd.Parameters.AddWithValue("@name", "Bikram");
        insertCmd.Parameters.AddWithValue("@password", "12342");

        con.Open();

        insertCmd.ExecuteNonQuery();

        Console.WriteLine("Record inserted successfully.");


        // ---------------- SELECT WITH WHERE ----------------
        string selectQuery =
            "SELECT Id, Name, Password FROM Users WHERE Id = @id";

        SqlCommand selectCmd = new SqlCommand(selectQuery, con);

        selectCmd.Parameters.AddWithValue("@id", 8);

        SqlDataReader reader = selectCmd.ExecuteReader();

        Console.WriteLine("\nSelected Record:");

        while (reader.Read())
        {
            Console.WriteLine(
                "Id = {0}, Name = {1}, Password = {2}",
                reader["Id"],
                reader["Name"],
                reader["Password"]);
        }

        reader.Close();


        // ---------------- UPDATE ----------------
        string updateQuery =
            "UPDATE Users SET Name=@name, Password=@password WHERE Id=@id";

        SqlCommand updateCmd = new SqlCommand(updateQuery, con);

        updateCmd.Parameters.AddWithValue("@name", "Bikram Gyawali");
        updateCmd.Parameters.AddWithValue("@password", "67890");
        updateCmd.Parameters.AddWithValue("@id", 1);

        updateCmd.ExecuteNonQuery();

        Console.WriteLine("\nRecord updated successfully.");


        // ---------------- DELETE ----------------
        string deleteQuery =
            "DELETE FROM Users WHERE Id=@id";

        SqlCommand deleteCmd = new SqlCommand(deleteQuery, con);

        deleteCmd.Parameters.AddWithValue("@id", 1);

        deleteCmd.ExecuteNonQuery();

        Console.WriteLine("Record deleted successfully.");

        con.Close();

        Console.ReadKey();
    }
}
