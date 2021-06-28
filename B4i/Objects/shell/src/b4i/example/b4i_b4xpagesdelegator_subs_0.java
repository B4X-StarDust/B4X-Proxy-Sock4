package b4i.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xpagesdelegator_subs_0 {


public static RemoteObject  _activity_pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (b4xpagesdelegator) ","b4xpagesdelegator",10,__ref.getField(false, "bi"),__ref,52);
if (RapidSub.canDelegate("activity_pause")) { return __ref.runUserSub(false, "b4xpagesdelegator","activity_pause", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub Activity_Pause";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="B4XPages.GetManager.Activity_Pause";
Debug.JustUpdateDeviceLine();
b4i_b4xpagesdelegator._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ).runClassMethod (b4i_b4xpagesmanager.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (b4xpagesdelegator) ","b4xpagesdelegator",10,__ref.getField(false, "bi"),__ref,48);
if (RapidSub.canDelegate("activity_resume")) { return __ref.runUserSub(false, "b4xpagesdelegator","activity_resume", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Public Sub Activity_Resume";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="B4XPages.GetManager.Activity_Resume";
Debug.JustUpdateDeviceLine();
b4i_b4xpagesdelegator._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ).runClassMethod (b4i_b4xpagesmanager.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagesdelegator) ","b4xpagesdelegator",10,__ref.getField(false, "bi"),__ref,4);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagesdelegator","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 4;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 6;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (b4xpagesdelegator) ","b4xpagesdelegator",10,__ref.getField(false, "bi"),__ref,44);
if (RapidSub.canDelegate("mainform_resize")) { return __ref.runUserSub(false, "b4xpagesdelegator","mainform_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 44;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
Debug.JustUpdateDeviceLine();
b4i_b4xpagesdelegator._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ).runClassMethod (b4i_b4xpagesmanager.class, "_mainform_resize::" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}