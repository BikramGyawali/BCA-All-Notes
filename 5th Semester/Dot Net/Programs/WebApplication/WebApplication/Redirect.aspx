<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Redirect.aspx.cs" Inherits="WebApplication.Redirect" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body style="background-color:deepskyblue">
    <form id="form1" runat="server">
           
        <div>
            <h1>Redirect form </h1>

            <h1> Enter Your Name : </h1>
            <asp:TextBox runat="server" ID="txt1" Width="300" />

            <h3>Contact :</h3>
            <asp:TextBox runat="server" ID="txt2"  Width="300"/>
            <br />   <br />
            <asp:Button  runat="server" ID="btn1" Text="Submit"  OnClick="btn_Clicked" Width="150"/>
        </div>
            
    </form>
</body>
</html>
