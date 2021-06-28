
package b4i.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_sockhandle {
    public static RemoteObject myClass;
	public b4i_sockhandle() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_sockhandle.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _client = RemoteObject.declareNull("B4ISocketWrapper");
public static RemoteObject _toserver = RemoteObject.declareNull("B4ISocketWrapper");
public static RemoteObject _instream = RemoteObject.declareNull("B4IAsyncStreams");
public static RemoteObject _outstream = RemoteObject.declareNull("B4IAsyncStreams");
public static RemoteObject _deal = RemoteObject.createImmutable(false);
public static RemoteObject _vers = RemoteObject.createImmutable(0);
public static RemoteObject _cd = RemoteObject.createImmutable(0);
public static RemoteObject _host = RemoteObject.createImmutable("");
public static RemoteObject _port = RemoteObject.createImmutable(0);
public static RemoteObject _responsedata = null;
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Cd",_ref.getField(false, "_cd"),"client",_ref.getField(false, "_client"),"deal",_ref.getField(false, "_deal"),"Host",_ref.getField(false, "_host"),"inStream",_ref.getField(false, "_instream"),"outStream",_ref.getField(false, "_outstream"),"Port",_ref.getField(false, "_port"),"ResponseData",_ref.getField(false, "_responsedata"),"toServer",_ref.getField(false, "_toserver"),"Vers",_ref.getField(false, "_vers")};
}
}