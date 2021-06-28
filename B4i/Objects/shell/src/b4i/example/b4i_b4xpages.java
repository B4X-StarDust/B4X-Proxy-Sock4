
package b4i.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_b4xpages implements IRemote{
	public static b4i_b4xpages mostCurrent;
    public static RemoteObject ba;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new b4i_b4xpages();
        remoteMe = RemoteObject.declareNull("b4i.example.b4i_b4xpages");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4i.example.b4i_b4xpages", "b4i.example.b4i_b4xpages");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_b4xpages.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public static RemoteObject getObject() {
		return remoteMe;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
        remoteMe = (RemoteObject) args[2];
        __c = (RemoteObject)args[3];
		pcBA = new PCBA(this, b4i_b4xpages.class);
        try {
            BA.init();
            b4i_b4xpages_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _mpm = RemoteObject.declareNull("NSObject");
public static RemoteObject _delegate = RemoteObject.declareNull("b4i_b4xpagesdelegator");
public static RemoteObject _globalcontext = RemoteObject.declareNull("NSObject");
public static b4i_main _main = null;
public static b4i_b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4i_b4xcollections.class),"Delegate",b4i_b4xpages._delegate,"GlobalContext",b4i_b4xpages._globalcontext,"Main",Debug.moduleToString(b4i_main.class),"mPM",b4i_b4xpages._mpm};
}
}