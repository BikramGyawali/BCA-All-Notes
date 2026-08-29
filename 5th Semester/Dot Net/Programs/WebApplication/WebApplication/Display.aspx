<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Display.aspx.cs" Inherits="WebApplication.Display" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body style="background-color:navajowhite">
    <form id="form1" runat="server" >
        <div>
            <h2>Received data</h2>

            <br /> <br />

            <h3>Name : </h3>
          <b>

            <asp:Label ID="lbl1" runat="server" />
          </b>

            <br /> <br />

            <h3>Conact Number</h3>

          <b>
              <asp:Label ID="lbl2" runat="server" />
          </b>  
        </div>
    </form>
</body>
</html>
