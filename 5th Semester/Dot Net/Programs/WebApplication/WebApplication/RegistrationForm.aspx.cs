using System;
using System.Web.UI;
using System.Configuration;
using System.Data.SqlClient;

namespace WebApplication
{
    public partial class RegistrationForm : Page
    {
        protected void Page_Load(Object sender,EventArgs e) { }

        protected void btn_Submit(Object sender,EventArgs e)
        {
            string connString = ConfigurationManager.ConnectionStrings["MyConnection"].ConnectionString; 
            // MyConnection should same as what i use in the configuration file 

            SqlConnection conn = new SqlConnection(connString);

            // for input from form
            string name = txt1.Text;
            string pass = txt2.Text;

            string query = "INSERT INTO Users(Name,Password) VALUES (@Name,@Pass)";

            SqlCommand cmd = new SqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Name", name);
            cmd.Parameters.AddWithValue("@Pass", pass);

            conn.Open();

            cmd.ExecuteNonQuery();
            conn.Close();
            lbl1.Text = "Record Saved Successfully";

            txt1.Text = "";  //to make the field empty after save
            txt2.Text = "";


        }
    }
}