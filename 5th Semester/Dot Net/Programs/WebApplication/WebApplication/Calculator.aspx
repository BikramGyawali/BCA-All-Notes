<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Calculator.aspx.cs" Inherits="WebApplication.Calculator" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
    <style>
        
        body{
            display:flex;
            justify-content:center;
            margin-top:50px;
            background-color:aqua;
        }
        form{
            padding:20px;
            width:500px;
            border:1px solid #000;
            border-radius:8px;
            box-shadow: 0 0 10px rgb(0,4,0,0.1)
           
        }

        .caldiv{
    display:flex;
    align-items:center;
    margin-bottom:20px;
    
}
        .caldiv h2{
            width:220px;
            font-size:18px;
        }
        .caldiv input{
            padding:8px 10px;
            font-size:16px;
            flex:1
           
        }
        .button_row{
            display:flex;
            justify-content:center;
            gap:12px;
            margin:25px 0;
        }
         .button_row input{
            padding:10px;
            color:White;
            background-color:Red;
                margin:3px;
                border:1px solid #ccc;
                gap:3px
        }
        .result_row{
           display:flex;
           justify-content:center;
           gap:12px;
        }
        .error{
            color:red;
            font-size:14px;

        }
    </style>
<body>  
    <form id="form1" runat="server">
        <div class="caldiv">
       <h2>Enter your 1st number</h2>
            <asp:TextBox runat="server" ID="num1" />
            <asp:RequiredFieldValidator  runat="server" ID="rfvNum1" ValidationGroup="cal"
                ControlToValidate="num1" Text="*" ErrorMessage="Number is required in n1" 
                CssClass="error"
                />
            <asp:CompareValidator runat="server" ID="cvNum1" ValidationGroup="cal"
                ControlToValidate="num1" Operator="DataTypeCheck" Type="Double"
                ErrorMessage="Entere a validate number" CssClass="error"
                
                />
        </div>
        <div class="caldiv">
            <h2>Enter your second number</h2>
            <asp:TextBox runat="server" ID="num2" />

            <asp:RequiredFieldValidator  runat="server" ID="rfvNum2" ValidationGroup="cal"
                ControlToValidate="num2" ErrorMessage="Number 2 is Required" Text="*" CssClass="error"
                
                />

            <asp:CompareValidator  runat="server" ID="cvNum2" ValidationGroup="cal"
                ControlToValidate="num2" Operator="DataTypeCheck" Type="Double" 
                ErrorMessage="Invalid Number format in n2" CssClass="error"
                
                />
        </div>
        <div class="button_row">
            <asp:Button runat="server" ID="btn1" OnClick="btnAdd" Text="Add" ValidationGroup="cal"/>
            <asp:Button runat="server" ID="btn2" OnClick="btnSub" Text="Sub" ValidationGroup="cal"/>
            <asp:Button  runat="server" ID="btn3" OnClick="btnMul" Text="Mul" ValidationGroup="cal"/>
            <asp:Button runat="server" ID="btn4" OnClick="btnDiv" Text="Div" ValidationGroup="cal"/>
        </div>
        <div class="result_row">
            <asp:Label runat="server" ID="lbl">Result</asp:Label>
        <asp:Label runat="server" ID="result"/>
        </div>
        <asp:ValidationSummary HeaderText="Please solve these errors" ForeColor="Red" runat="server" ID="vsCal" ValidationGroup="cal" />
    </form>
</body>
</html>
