<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ATest.aspx.cs" Inherits="Mpad.ATest" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>MPAD Test</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            MPAD Test
            <p />

            <a href="Default.aspx">Home</a>
            <p />

            Object
            <br />
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Create" />
            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Access" />
            <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Modify" />
            <asp:Button ID="Button4" runat="server" OnClick="Button4_Click" Text="Delete" />
            <p />

            Access
            <br />
            <asp:Button ID="Button5" runat="server" OnClick="Button5_Click" Text="Login" />
            <asp:Button ID="Button6" runat="server" OnClick="Button6_Click" Text="Logoff" />
            <asp:Button ID="Button7" runat="server" OnClick="Button7_Click" Text="Fail" />
            <asp:Button ID="Button8" runat="server" OnClick="Button8_Click" Text="Reset" />
        </div>
    </form>
</body>
</html>
