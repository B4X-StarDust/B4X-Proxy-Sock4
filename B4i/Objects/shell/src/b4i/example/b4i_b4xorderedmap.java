
package b4i.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xorderedmap {
    public static RemoteObject myClass;
	public b4i_b4xorderedmap() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xorderedmap.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _map = RemoteObject.declareNull("B4IMap");
public static RemoteObject _list = RemoteObject.declareNull("B4IList");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"list",_ref.getField(false, "_list"),"map",_ref.getField(false, "_map")};
}
}