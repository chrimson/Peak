﻿using System.Data.SqlClient;

namespace Mpam
{
    public class PaEvt
    {
        private string conType { get; set; }
        private string evtType { get; set; }

        public PaEvt()
        {
            // Constructor
        }

        public string recObjEvt(ObjEvt objEvt)
        {
            conType = objEvt.conType;
            evtType = objEvt.evtType;

            savePaEvt();

            return "fff";
        }

        public string recAccEvt(AccEvt accEvt)
        {
            conType = accEvt.conType;
            evtType = accEvt.evtType;

            savePaEvt();

            return "fff";
        }

        private void savePaEvt()
        {
            System.Diagnostics.Debug.WriteLine("{0} {1}", conType, evtType);

            // SQL depending on private members
            SqlConnection aCon = new SqlConnection(
                "Server=ADMIN-PC\\SQLEXPRESS;" +  // or localhost
                "Database=peak;" +
                "Trusted_Connection=true");
            try
            {
                aCon.Open();

                string cmdTxt = string.Format(
                    "INSERT INTO Aud VALUES ('{0}', '{1}')",
                    conType, evtType);
                SqlCommand cmd = new SqlCommand(cmdTxt, aCon);

                SqlDataReader data = cmd.ExecuteReader();
            }
            catch { }
        }
    }

    public class ObjEvt
    {
        public string conType { get; set; }
        public string evtType { get; set; }

        public static readonly ObjEvt CREATE = new ObjEvt("Obj", "CREATE");
        public static readonly ObjEvt ACCESS = new ObjEvt("Obj", "ACCESS");
        public static readonly ObjEvt MODIFY = new ObjEvt("Obj", "MODIFY");
        public static readonly ObjEvt DELETE = new ObjEvt("Obj", "DELETE");

        public ObjEvt(string cType, string eType)
        {
            conType = cType;
            evtType = eType;
        }
    }

    public class AccEvt
    {
        public string conType { get; set; }
        public string evtType { get; set; }

        public static readonly AccEvt LOGIN  = new AccEvt("Acc", "LOGIN");
        public static readonly AccEvt LOGOFF = new AccEvt("Acc", "LOGOFF");
        public static readonly AccEvt FAIL   = new AccEvt("Acc", "FAIL");
        public static readonly AccEvt RESET  = new AccEvt("Acc", "RESET");

        public AccEvt(string cType, string eType)
        {
            conType = cType;
            evtType = eType;
        }
    }

}
