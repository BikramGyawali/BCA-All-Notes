
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="CRUD.aspx.cs" Inherits="WebApplication.CRUD" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>CRUD Operation</title>
</head>
<body>
    <form id="form1" runat="server">
        <h2>User CRUD Operation</h2>

        <asp:Label runat="server" Text="ID: " />
        <asp:TextBox ID="txtId" runat="server" />
        <br /><br />

        <asp:Label runat="server" Text="Name: " />
        <asp:TextBox ID="txtName" runat="server" />
        <br /><br />

        <asp:Label runat="server" Text="Password: " />
        <asp:TextBox ID="txtPassword" runat="server" TextMode="Password" />
        <br /><br />

        <asp:Button ID="btnInsert" runat="server" Text="Insert" OnClick="btnInsert_Click" />
        <asp:Button ID="btnSelect" runat="server" Text="Select" OnClick="btnSelect_Click" />
        <asp:Button ID="btnUpdate" runat="server" Text="Update" OnClick="btnUpdate_Click" />
        <asp:Button ID="btnDelete" runat="server" Text="Delete" OnClick="btnDelete_Click" />

        <br /><br />

        <asp:Label ID="lblMessage" runat="server" ForeColor="Green" />

        <br /><br />

        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
    </form>
</body>
</html>

