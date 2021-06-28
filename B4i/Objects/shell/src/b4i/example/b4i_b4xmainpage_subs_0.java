package b4i.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout::",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "bi"));
 BA.debugLineNum = 23;BA.debugLine="ps.Start";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ps" /*RemoteObject*/ ).runClassMethod (b4i_proxysocks4.class, "_start" /*void*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,28);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="ps.Stop";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ps" /*RemoteObject*/ ).runClassMethod (b4i_proxysocks4.class, "_stop" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="xui.MsgboxAsync(\"Start proxy server socks4!\", \"B4";
Debug.ShouldStop(536870912);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync:::",__ref.getField(false, "bi"),(Object)(BA.ObjectToString("Start proxy server socks4!")),(Object)(RemoteObject.createImmutable("B4X")));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4i_b4xmainpage._root = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_root",b4i_b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4i_b4xmainpage._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private ps As proxysocks4";
b4i_b4xmainpage._ps = RemoteObject.createNew ("b4i_proxysocks4");__ref.setField("_ps",b4i_b4xmainpage._ps);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="ps.Initialize(1080)";
Debug.ShouldStop(32768);
__ref.getField(false,"_ps" /*RemoteObject*/ ).runClassMethod (b4i_proxysocks4.class, "_initialize::" /*RemoteObject*/ ,__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, 1080)));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}