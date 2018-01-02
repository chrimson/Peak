package jpam;

public class PaEvt {

    private String conType;
    private String evtType;

	public PaEvt() {
        // Constructor
    }

    public String recObjEvt(ObjEvt objEvt) {
        conType = objEvt.conType;
        evtType = objEvt.evtType;

        savePaEvt();

        return "fff";
    }

    public String recAccEvt(AccEvt accEvt) {
        conType = accEvt.conType;
        evtType = accEvt.evtType;

        savePaEvt();

        return "fff";
    }
    
    private void savePaEvt()
    {
        // SQL depending on private members

        System.out.format("%s %s%n", new String[]{conType, evtType});
    }
}
