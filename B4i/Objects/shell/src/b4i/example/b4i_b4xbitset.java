
package b4i.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xbitset {
    public static RemoteObject myClass;
	public b4i_b4xbitset() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xbitset.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _data = null;
public static RemoteObject _msize = RemoteObject.createImmutable(0);
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"data",_ref.getField(false, "_data"),"mSize",_ref.getField(false, "_msize")};
}
}