package jpam;

public class AccEvt {
    public String conType;
    public String evtType;

    public static final AccEvt LOGIN  = new AccEvt("Acc", "LOGIN");
    public static final AccEvt LOGOFF = new AccEvt("Acc", "LOGOFF");
    public static final AccEvt FAIL   = new AccEvt("Acc", "FAIL");
    public static final AccEvt RESET  = new AccEvt("Acc", "RESET");

    public AccEvt(String cType, String eType)
    {
        conType = cType;
        evtType = eType;
    }
}
