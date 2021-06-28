package b4i.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,27);
if (RapidSub.canDelegate("application_background")) { return b4i_main.remoteMe.runUserSub(false, "main","application_background");}
 BA.debugLineNum = 27;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(134217728);
b4i_main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4i_b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_foreground() throws Exception{
try {
		Debug.PushSubsStack("Application_Foreground (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,31);
if (RapidSub.canDelegate("application_foreground")) { return b4i_main.remoteMe.runUserSub(false, "main","application_foreground");}
 BA.debugLineNum = 31;BA.debugLine="Private Sub Application_Foreground";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(-2147483648);
b4i_main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4i_b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,19);
if (RapidSub.canDelegate("application_start")) { return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);}
RemoteObject _pagesmanager = RemoteObject.declareNull("b4i_b4xpagesmanager");
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 19;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="NavControl = Nav";
Debug.ShouldStop(524288);
b4i_main._navcontrol = _nav;
 BA.debugLineNum = 21;BA.debugLine="Dim PagesManager As B4XPagesManager";
Debug.ShouldStop(1048576);
_pagesmanager = RemoteObject.createNew ("b4i_b4xpagesmanager");Debug.locals.put("PagesManager", _pagesmanager);
 BA.debugLineNum = 22;BA.debugLine="PagesManager.Initialize(NavControl)";
Debug.ShouldStop(2097152);
_pagesmanager.runClassMethod (b4i_b4xpagesmanager.class, "_initialize::" /*RemoteObject*/ ,b4i_main.ba,(Object)(b4i_main._navcontrol));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}