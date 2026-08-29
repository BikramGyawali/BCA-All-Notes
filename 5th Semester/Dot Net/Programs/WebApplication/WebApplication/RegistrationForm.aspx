<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="RegistrationForm.aspx.cs" Inherits="WebApplication.RegistrationForm" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body style="background-color:antiquewhite">
    <form id="form1" runat="server">
        <div>
            <h2>Registration Form</h2>

            <h5>Name : </h5> 
            <asp:TextBox runat="server" ID="txt1" Width="200"/>
            <br /><br />

            <h5>Password</h5>
            <asp:TextBox runat="server" ID="txt2" Width="200" TextMode="Password"/>
            <br /><br />
            <asp:Button runat="server" Text="Submit" ID="btn1" OnClick="btn_Submit" Width="100"/>

            <br /><br />

            <asp:Label ID="lbl1" runat="server" ForeColor="Green" />
        </div>
    </form>
</body>
</html>
