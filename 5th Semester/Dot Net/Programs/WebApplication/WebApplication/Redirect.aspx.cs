using System;

using System.Web.UI;
namespace WebApplication
{
    public partial class Redirect : Page
    {
        protected void Page_Load(Object sender,EventArgs e)
        {

        }
        protected void btn_Clicked(Object sender,EventArgs e)
        {
            string Name = txt1.Text;
            long Number = Convert.ToInt64(txt2.Text);  //long is used here because the number
                                                       //size is longer so required long to store

            Response.Redirect("Display.aspx?name=" + Name + "&number=" + Number);
        }
    }
}