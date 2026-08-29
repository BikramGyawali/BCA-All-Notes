using System;
using System.Web.UI;

 namespace WebApplication
{
    public partial class Display : Page
    {
        public void Page_Load(Object sender,EventArgs e) {

            lbl1.Text = Request.QueryString["name"];
            lbl2.Text = Request.QueryString["number"];
        }
        
    }
}