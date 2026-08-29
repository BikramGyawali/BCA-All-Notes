using System;
using System.Web.UI;

namespace WebApplication          
{
   public partial class Register : Page
    {
        protected void Page_Load (Object sender,EventArgs e)
        {

        }

        protected void btnSumbit_Click(Object sender,EventArgs e)
        {
            if (Page.IsValid)
            {
                string gender = "";
                if (rbMale.Checked) gender = "Male";
                else if (rbFemale.Checked) gender = "Female";
                else if (rbOther.Checked) gender = "Other";
                else gender = "Not Selected";

                string subjects = "";
                if (chkMath.Checked) subjects += "Math";
                if (chkEnglish.Checked) subjects += "English";
                if (chkScience.Checked) subjects += "Science";
                if (chkComputer.Checked) subjects += "Computer";

                lblMessage.Text = "<b> Registration of Student Successful  </b> <br/> <br/>" +
                    "Name :      " + txtName.Text + "<br/>" +
                    "EMail :    " + txtEmail.Text + "<br/>" +
                    "Age :      " + txtAge.Text + "<br/>" +
                    "Address :  " + txtAddress.Text + "<br/>" +
                    "Phone :    " + txtPhone.Text + "<br/>" +
                    "Gender :    " + gender + "<br/>" +
                    "Course :   " + ddlCourse.SelectedValue + "<br/>" +
                    "Subjects :  " + subjects;


               }
        }

        protected void btnReset_Click(Object senders,EventArgs e)
        {
            txtName.Text = "";
            txtAge.Text = "";
            txtAddress.Text = "";
            txtPhone.Text = "";
            txtEmail.Text = "";
            txtPassword.Text = "";
            txtConfirm.Text = "";

            rbMale.Checked = false;
            rbFemale.Checked = false;
            rbOther.Checked = false;

            chkComputer.Checked = false;
            chkEnglish.Checked = false;
            chkMath.Checked = false;
            chkScience.Checked = false;

            ddlCourse.SelectedIndex = 0;
            lblMessage.Text = "";
        }
    }
}