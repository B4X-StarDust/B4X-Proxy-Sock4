
package b4i.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_proxysocks4 {
    public static RemoteObject myClass;
	public b4i_proxysocks4() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_proxysocks4.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _serv = RemoteObject.declareNull("B4IServerSocketWrapper");
public static RemoteObject _work = RemoteObject.createImmutable(false);
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Serv",_ref.getField(false, "_serv"),"Work",_ref.getField(false, "_work")};
}
}