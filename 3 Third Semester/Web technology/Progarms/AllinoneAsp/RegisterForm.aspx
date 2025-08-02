<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeFile="RegisterForm.aspx.cs" Inherits="RegisterForm" %>
<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <center>
        <br /><br /><br /><br />
        <asp:Label ID="l1" runat="server" Text="Name :"  ></asp:Label>
        <asp:TextBox ID="t1" runat="server"  ></asp:TextBox> 
        <asp:RequiredFieldValidator ID="r1" runat="server" ErrorMessage="Enter USername" ControlToValidate="t1"></asp:RequiredFieldValidator><br /><br />
        <asp:Label ID="l2" runat="server" Text="Password : "></asp:Label> 
        <asp:TextBox ID="t2" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator runat="server" ErrorMessage="Enter Password" ControlToValidate="t2" ID="r2"></asp:RequiredFieldValidator>
        <br /><br />
        <asp:Button ID="b1" runat="server" Text="Register" OnClick="btn" />

        <br /><br />
        <asp:Label ID="l3" runat="server" ></asp:Label>
    </center>
</asp:Content>
