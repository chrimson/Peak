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

            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Create" />
            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Access" />
            <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Modify" />
            <asp:Button ID="Button4" runat="server" OnClick="Button4_Click" Text="Delete" />
        </div>
    </form>
</body>
</html>
