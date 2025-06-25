<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeFile="Calculator.aspx.cs" Inherits="Calculator" %>
<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
   <center>
        <asp:Label runat="server" Text="FirstNumber" ID="l1"></asp:Label>
 <asp:TextBox runat="server" ID="t1"></asp:TextBox>
 <br /><br />
 <asp:Label runat="server" ID="l2" Text="SecondNumber"></asp:Label>
 <asp:TextBox runat="server" ID="t2"></asp:TextBox>
 <br /><br />
 <asp:Label ID="result" runat="server"></asp:Label>
 <br /><br />
 <asp:Button ID="add" Text="Add" OnClick="sum" runat="server" />
 <asp:Button ID="sub" Text="Substraction" OnClick="diff" runat="server" />
 <asp:Button ID="mul" Text="Multiplication" OnClick="multiply" runat="server" />
 <asp:Button ID="div" Text="Division" OnClick="divide" runat="server" />
   </center>
</asp:Content>
