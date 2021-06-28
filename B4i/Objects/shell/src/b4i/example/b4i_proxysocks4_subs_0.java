package b4i.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_proxysocks4_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Serv As ServerSocket";
b4i_proxysocks4._serv = RemoteObject.createNew ("B4IServerSocketWrapper");__ref.setField("_serv",b4i_proxysocks4._serv);
 //BA.debugLineNum = 3;BA.debugLine="Private Work As Boolean = False";
b4i_proxysocks4._work = b4i_main.__c.runMethod(true,"False");__ref.setField("_work",b4i_proxysocks4._work);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _port) throws Exception{
try {
		Debug.PushSubsStack("Initialize (proxysocks4) ","proxysocks4",2,__ref.getField(false, "bi"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "proxysocks4","initialize", __ref, _ba, _port);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Port", _port);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(Port As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="Serv.Initialize(Port,\"Serv\")";
Debug.ShouldStop(128);
__ref.getField(false,"_serv" /*RemoteObject*/ ).runVoidMethod ("Initialize:::",__ref.getField(false, "bi"),(Object)(_port),(Object)(RemoteObject.createImmutable("Serv")));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (proxysocks4) ","proxysocks4",2,__ref.getField(false, "bi"),__ref,11);
if (RapidSub.canDelegate("start")) { __ref.runUserSub(false, "proxysocks4","start", __ref); return;}
ResumableSub_Start rsub = new ResumableSub_Start(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Start extends BA.ResumableSub {
public ResumableSub_Start(b4i_proxysocks4 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_proxysocks4 parent;
RemoteObject _successful = RemoteObject.createImmutable(false);
RemoteObject _newsocket = RemoteObject.declareNull("B4ISocketWrapper");
RemoteObject _newsocks = RemoteObject.declareNull("b4i_sockhandle");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Start (proxysocks4) ","proxysocks4",2,__ref.getField(false, "bi"),__ref,11);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 12;BA.debugLine="Work=True";
Debug.ShouldStop(2048);
__ref.setField ("_work" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 13;BA.debugLine="Do While Work";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//do while
this.state = 8;
while (__ref.getField(true,"_work" /*RemoteObject*/ ).getBoolean()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 14;BA.debugLine="Serv.Listen";
Debug.ShouldStop(8192);
__ref.getField(false,"_serv" /*RemoteObject*/ ).runVoidMethod ("Listen");
 BA.debugLineNum = 15;BA.debugLine="Wait For Serv_NewConnection (Successful As Boole";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethod ("WaitFor::::","serv_newconnection::", __ref.getField(false, "bi"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proxysocks4", "start"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_successful = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(1));Debug.locals.put("Successful", _successful);
_newsocket = (RemoteObject) result.runMethod(false,"objectAtIndex:", RemoteObject.createImmutable(2));Debug.locals.put("NewSocket", _newsocket);
;
 BA.debugLineNum = 17;BA.debugLine="If Successful Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (_successful.getBoolean()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 18;BA.debugLine="Dim NewSocks As SockHandle";
Debug.ShouldStop(131072);
_newsocks = RemoteObject.createNew ("b4i_sockhandle");Debug.locals.put("NewSocks", _newsocks);
 BA.debugLineNum = 19;BA.debugLine="NewSocks.Initialize(NewSocket)";
Debug.ShouldStop(262144);
_newsocks.runClassMethod (b4i_sockhandle.class, "_initialize::" /*RemoteObject*/ ,__ref.getField(false, "bi"),(Object)(_newsocket));
 if (true) break;

case 7:
//C
this.state = 1;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _serv_newconnection(RemoteObject __ref,RemoteObject _successful,RemoteObject _newsocket) throws Exception{
}
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (proxysocks4) ","proxysocks4",2,__ref.getField(false, "bi"),__ref,24);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "proxysocks4","stop", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub Stop";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Work=False";
Debug.ShouldStop(16777216);
__ref.setField ("_work" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}