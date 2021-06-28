
package b4i.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xmainpage {
    public static RemoteObject myClass;
	public b4i_b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _root = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _ps = RemoteObject.declareNull("b4i_proxysocks4");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ps",_ref.getField(false, "_ps"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}