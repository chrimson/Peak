using System;
using Mpam;

namespace Mpad
{
    public partial class ATest : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        // Object Event Handlers
        protected void Button1_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recObjEvt(ObjEvt.CREATE);
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recObjEvt(ObjEvt.ACCESS);
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recObjEvt(ObjEvt.MODIFY);
        }

        protected void Button4_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recObjEvt(ObjEvt.DELETE);
        }

        // Access Event Handlers
        protected void Button5_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recAccEvt(AccEvt.LOGIN);
        }

        protected void Button6_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recAccEvt(AccEvt.LOGOFF);
        }

        protected void Button7_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recAccEvt(AccEvt.FAIL);
        }

        protected void Button8_Click(object sender, EventArgs e)
        {
            PaEvt newPaEvt = new PaEvt();
            newPaEvt.recAccEvt(AccEvt.RESET);
        }
    }
}