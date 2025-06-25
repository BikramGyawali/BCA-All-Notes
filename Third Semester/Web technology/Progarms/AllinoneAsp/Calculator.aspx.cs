using System;
using System.Activities.Statements;
using System.Web.UI;

public partial class Calculator : Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
    }

    protected void sum(object sender, EventArgs e)
    {
        int a = int.Parse(t1.Text);
        int b = int.Parse(t2.Text);
        int c = a + b;
        result.Text = c.ToString();
    }
    protected void diff(object sender, EventArgs e)
    {
        int a = int.Parse(t1.Text);
        int b = int.Parse(t2.Text);
        int c = a - b;
        result.Text = c.ToString();
    }
    protected void multiply(object sender, EventArgs e)
    {
        int a = int.Parse(t1.Text);
        int b = int.Parse(t2.Text);
        int c = a * b;
        result.Text = c.ToString();
    }
    protected void divide(object sender, EventArgs e)
    {
        try
        {
            float a = float.Parse(t1.Text);
            float b = float.Parse(t2.Text);

            float c = a / b;
            result.Text = c.ToString();
        }
        catch (DivideByZeroException)
        {
            result.Text = "Divide by zero";
        }
    }
}
