<!--
Write an ASP.NET program to create a Student Registration Form that includes TextBox, 
RadioButton, CheckBox, DropDownList and demonstrates the use of RequiredFieldValidator,
CompareValidator, RangeValidator, RegularExpressionValidator and ValidationSummary without database connection. -->

<%@ Page Language="C#"
    AutoEventWireup="true"
    CodeBehind="Register.aspx.cs"
    Inherits="WebApplication.Register" %>
<!DOCTYPE html>
<html>

    <head runat="server">
        <title> Student Register</title>
        <style>
            body{
                font-family:Arial ; 
                margin:20px;
            }
            table{
                border-collapse:collapse;
                width:600px
            }
            td{
                padding:8px;
            }
            .head{
                background-color: #4CAF50;
                color: white;
                text-align: center;
                font-size: 20px;
                padding: 10px;
            }
            .sucess{
                color:green;
                font:14px;
                

            }
        </style>
    </head>
    <body>
        <form id="form1" runat="server">
            <table border="1">
                <tr>
                    <td colspan="3">
                        Student Register System
                    </td>
                </tr>
                <!-- Name -->

                <tr>
                    <td>
                        Full Name:
                    </td>
                    <td>
                        <asp:TextBox ID="txtName" runat="server" Width="200px"/>
                    </td>
                    <td>
                        <asp:RequiredFieldValidator ID="rfvName"
                            runat="server" ControlToValidate="txtName" 
                            ErrorMessage="Name is Required" Text="*" ForeColor="Red" ValidationGroup="reg"
                            />
                    </td>
                </tr>

                  <!-- Email
                       ValidationExpression="^[^\s@]+@[^\s@]+\.[^\s@]+$"
                      -->
                 
          <tr>
              <td>
                  Email:
              </td>
              <td>
                  <asp:TextBox ID="txtEmail" runat="server" Width="200px"/>
              </td>
              <td>
                 <asp:RequiredFieldValidator ID="rfvEmail"
                     runat="server" ControlToValidate="txtEmail"
                     ErrorMessage="Email field is Required" Text="*" ForeColor="Red"
                     ValidationGroup="reg"
                     />

                  <asp:RegularExpressionValidator ID="revEmail"
                      runat="server" ControlToValidate="txtEmail" ErrorMessage="Invalid Email format" Text="*" ForeColor="Red"
                      ValidationExpression="^[^\s@]+@[^\s@]+\.[^\s@]+$" ValidationGroup="reg"
                      />
              </td>
          </tr>
                        <!-- phone   -->

        <tr>
            <td>
                Phone Number:
            </td>
            <td>
                <asp:TextBox ID="txtPhone" runat="server" Width="200px"/>
            </td>
            <td>
              <asp:RequiredFieldValidator  
                  ID="rfvPhone" ControlToValidate="txtPhone"
                  ErrorMessage="Phone number is required" Text="*" ForeColor="Red" runat="server" 
                  ValdiationGroup="reg"
                  />

                <asp:RegularExpressionValidator ID="revPhone" runat="server" ControlToValidate="txtPhone" 
                    ErrorMessage="Phone number must be 10 digits" Text="*" ForeColor="Red"
                    ValidationExpression="[0-9]{10}" ValidationGroup="reg"
                    />
               
            </td>
        </tr>


                                <!-- Age implements RangeValidator -->

<tr>
    <td>
        Age:
    </td>
  <td>
      <asp:TextBox ID="txtAge" Width="200px"  runat="server"/>
  </td>
    <td>
     <asp:RequiredFieldValidator runat="server" ID="rfvAge" ControlToValidate="txtAge" ErrorMessage="Age is Required !"
         Text="*" ForeColor="Red" ValidationGroup="reg"/>

       <asp:RangeValidator runat="server" ID="rvAge" ControlToValidate="txtAge" 
           MinimumValue="16" MaximumValue="40" Type="Integer"
           ErrorMessage="Age must be 16 to 40 "  Text="*" ForeColor="Red" ValidationGroup="reg"
            />
       
    </td>
</tr>
                <!-- Password -->
                <tr>
                    <td>
                        Password :
                    </td>
                    <td>
                        <asp:TextBox runat="server" Width="200px" ID="txtPassword" TextMode="Password"/>
                    </td>
                    <td>
                        <asp:RequiredFieldValidator runat="server" ID="rfvPassword"
                            ControlToValidate="txtPassword" ErrorMessage="Password is Required"
                            Text="*" ForeColor="Red" ValidationGroup="reg"
                            />
                    </td>
                </tr>

                <!--Confirm Password implement CompareValidator -->
<tr>
    <td>
      Confirm  Password :
    </td>
    <td>
        <asp:TextBox runat="server" Width="200px" ID="txtConfirm" TextMode="Password"/>
    </td>
    <td>
        <asp:RequiredFieldValidator runat="server" ID="rfvConfirm"
            ControlToValidate="txtConfirm" ErrorMessage=" Confirm Password is Required"
            Text="*" ForeColor="Red" ValidationGroup="reg"
            />
        <asp:CompareValidator runat="server" ID="cvConfirm" ValidationGroup="reg"
            ControlToValidate="txtConfirm" ControlToCompare="txtPassword" Operator="Equal" Type="String"
            ErrorMessage="Passwords do no match" Text="*" ForeColor="Red"
            
            />
    </td>
</tr>

                <!-- Gender implement RadioButton-->

                <tr>
                    <td>
                        Gender :
                    </td>
                    <td>
                        <asp:RadioButton ID="rbMale" runat="server" Text="Male" GroupName="Gender"  />
                        <asp:RadioButton  ID="rbFemale" runat="server" Text="Female" GroupName="Gender"/>
                        <asp:RadioButton ID="rbOther" runat="server" Text="Other" GroupName="Gender" />
                    </td>
                </tr>

                <!-- Course implement drop down -->
                <tr>
                    <td>
                        Courses :
                    </td>
                    <td> 
                        <asp:DropDownList ID="ddlCourse" runat="server" Width="200px" >
                            <asp:ListItem Value="">Select Course</asp:ListItem>
                            <asp:ListItem Value="BCA">BCA</asp:ListItem>
                            <asp:ListItem Value="BBA">BBA</asp:ListItem>
                            <asp:ListItem Value="BHM">BHM</asp:ListItem>
                        </asp:DropDownList>
                    </td>
                    <td>
                        <asp:RequiredFieldValidator ID="rfvCourse" runat="server" ValidationGroup="reg"
                           ControlToValidate="ddlCourse" InitialValue="" ErrorMessage="Select a Course" Text="*" ForeColor="Red"
                            />
                    </td>
                </tr>

                <!-- Subject implement CheckBox -->

                <tr>
                    <td>
                        Subjects:
                    </td>
                    <td>
                        <asp:CheckBox ID="chkMath" runat="server" Text="Math" /> <br />
                        <asp:CheckBox ID="chkScience" runat="server" Text="Science"/> <br />
                        <asp:CheckBox ID="chkEnglish" runat="server" Text="English"/>
                <br/>
                <asp:CheckBox ID="chkComputer" runat="server" Text="Computer"/>
                    </td>
                    <td></td>
                </tr>

                <!-- Address  TextBox with mode -->
                <tr>
                    <td>
                        Address :
                    </td>
                    <td>
                        <asp:TextBox ID="txtAddress" runat="server" TextMode="MultiLine" Rows="3" Width="200px" />
                    </td>
                    <td>
                <asp:RequiredFieldValidator ID="rfvAddress" runat="server"   ValidationGroup="reg"
                    ControlToValidate="txtAddress"
                    ErrorMessage="Address is required!"
                    ForeColor="Red"
                  />
            </td>
                </tr>

                <!-- Button
                    CausesValidation=false skip validation when the button click-->
                <tr>
                    <td colspan="3" align="center">
                        <asp:Button ID="btnSubmit" runat="server" OnClick="btnSumbit_Click" Text="Register" 
                            ValidationGroup="reg"/>
                        <asp:Button ID="btnReset" runat="server" OnClick="btnReset_Click" Text="Reset" ValidationGroup="reg"
                            CausesValidation="false"/>
                    </td>
                </tr>

                <!-- Result asp label -->
                <tr>
                    <td colspan="3" align="center">
                       <asp:Label ID="lblMessage" runat="server" Text="Result will show here" CssClass="sucess" />  
                    </td>
                </tr>       

                <!-- Validation Summary -->
                <asp:ValidationSummary runat="server" ID="vsSummary" HeaderText="Please fix these errors:" ForeColor="Red"
                    ValidationGroup="reg"/>
            </table>
        </form>
    </body>
</html>