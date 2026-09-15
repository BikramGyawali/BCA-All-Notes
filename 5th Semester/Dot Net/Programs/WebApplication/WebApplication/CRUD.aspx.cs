
using System;
using System.Configuration;
using System.Data.SqlClient;
using System.Data;

namespace WebApplication
{
    public partial class CRUD : System.Web.UI.Page
    {
        string connectionString =
            ConfigurationManager
            .ConnectionStrings["MyConnection"]
            .ConnectionString;


        // CREATE / INSERT
        protected void btnInsert_Click(object sender, EventArgs e)
        {
            SqlConnection con =
                new SqlConnection(connectionString);

            string query =
                "INSERT INTO Users(Name, Password) " +
                "VALUES(@Name, @Password)";

            SqlCommand cmd =
                new SqlCommand(query, con);

            cmd.Parameters.AddWithValue("@Name", txtName.Text);
            cmd.Parameters.AddWithValue("@Password", txtPassword.Text);

            con.Open();

            cmd.ExecuteNonQuery();

            con.Close();

            lblMessage.Text = "Record inserted successfully.";

            Clear();
        }


        // READ / SELECT
        protected void btnSelect_Click(object sender, EventArgs e)
        {
            SqlConnection con =
                new SqlConnection(connectionString);

            string query =
                "SELECT Id, Name, Password FROM Users";

            SqlDataAdapter adapter =
                new SqlDataAdapter(query, con);

            DataTable dt = new DataTable();

            adapter.Fill(dt);

            GridView1.DataSource = dt;
            GridView1.DataBind();

            lblMessage.Text = "Records displayed.";
        }


        // UPDATE
        protected void btnUpdate_Click(object sender, EventArgs e)
        {
            SqlConnection con =
                new SqlConnection(connectionString);

            string query =
                "UPDATE Users SET Name=@Name, Password=@Password " +
                "WHERE Id=@Id";

            SqlCommand cmd =
                new SqlCommand(query, con);

            cmd.Parameters.AddWithValue("@Id", txtId.Text);
            cmd.Parameters.AddWithValue("@Name", txtName.Text);
            cmd.Parameters.AddWithValue("@Password", txtPassword.Text);

            con.Open();

            cmd.ExecuteNonQuery();

            con.Close();

            lblMessage.Text = "Record updated successfully.";

            Clear();
        }


        // DELETE
        protected void btnDelete_Click(object sender, EventArgs e)
        {
            SqlConnection con =
                new SqlConnection(connectionString);

            string query =
                "DELETE FROM Users WHERE Id=@Id";

            SqlCommand cmd =
                new SqlCommand(query, con);

            cmd.Parameters.AddWithValue("@Id", txtId.Text);

            con.Open();

            cmd.ExecuteNonQuery();

            con.Close();

            lblMessage.Text = "Record deleted successfully.";

            Clear();
        }


        // Clear textboxes
        private void Clear()
        {
            txtId.Text = "";
            txtName.Text = "";
            txtPassword.Text = "";
        }
    }
}
