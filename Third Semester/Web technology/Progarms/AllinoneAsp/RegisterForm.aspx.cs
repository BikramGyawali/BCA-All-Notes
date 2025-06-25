using System;






    public partial class RegisterForm : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

    protected void btn(object sender,EventArgs e)
    {
        string name = t1.Text;
        string pass = t2.Text;
        l3.Text = "You have register   "   + name;
    }

    }
