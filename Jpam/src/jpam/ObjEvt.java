package jpam;

public class ObjEvt {
    public String conType;
    public String evtType;

    public static final ObjEvt CREATE = new ObjEvt("Obj", "CREATE");
    public static final ObjEvt ACCESS = new ObjEvt("Obj", "ACCESS");
    public static final ObjEvt MODIFY = new ObjEvt("Obj", "MODIFY");
    public static final ObjEvt DELETE = new ObjEvt("Obj", "DELETE");

    public ObjEvt(String cType, String eType)
    {
        conType = cType;
        evtType = eType;
    }
}
