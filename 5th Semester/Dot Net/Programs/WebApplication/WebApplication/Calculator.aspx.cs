using System;

using System.Web.UI;


namespace WebApplication
{
    public partial class Calculator : Page
    {
        protected void Page_Load(Object sender,EventArgs e)
        {

        }
        protected void btnAdd (Object sender,EventArgs e)
        {
            if (Page.IsValid)
            {
                double n1 = Convert.ToDouble(num1.Text);
                double n2 = Convert.ToDouble(num2.Text);
                result.Text = n1 + "+" + n2 + "= " + (n1 + n2).ToString();
            }
        }

        protected void btnSub(Object sender,EventArgs e)
        {
            if (Page.IsValid)
            {
                double n1 = Convert.ToDouble(num1.Text);
                double n2 = Convert.ToDouble(num2.Text);
                result.Text = n1 + "-" + n2 +  "= " +(n1 - n2).ToString();
            }
        }
        protected void btnMul(Object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                double n1 = Convert.ToDouble(num1.Text);
                double n2 = Convert.ToDouble(num2.Text);
                result.Text = n1 + "*" + n2 +  "= " +(n1 * n2).ToString();
            }
        }

        protected void btnDiv(Object sender,EventArgs e)    
        {
            double n1 = Convert.ToDouble(num1.Text);
            double n2 = Convert.ToDouble(num2.Text);
            if (n2 == 0){
                result.Text = "Cannot divide by zero"; 
                return;
            }
            else
               { 
                result.Text = n1 + "/" + n2 +  "= " +"= " +(n1 / n2).ToString();
            }
        }
    }
}