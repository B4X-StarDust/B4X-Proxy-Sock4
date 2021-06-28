package b4i.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_sockhandle_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private client As Socket";
b4i_sockhandle._client = RemoteObject.createNew ("B4ISocketWrapper");__ref.setField("_client",b4i_sockhandle._client);
 //BA.debugLineNum = 3;BA.debugLine="Private toServer As Socket";
b4i_sockhandle._toserver = RemoteObject.createNew ("B4ISocketWrapper");__ref.setField("_toserver",b4i_sockhandle._toserver);
 //BA.debugLineNum = 4;BA.debugLine="Private inStream As AsyncStreams";
b4i_sockhandle._instream = RemoteObject.createNew ("B4IAsyncStreams");__ref.setField("_instream",b4i_sockhandle._instream);
 //BA.debugLineNum = 5;BA.debugLine="Private outStream As AsyncStreams";
b4i_sockhandle._outstream = RemoteObject.createNew ("B4IAsyncStreams");__ref.setField("_outstream",b4i_sockhandle._outstream);
 //BA.debugLineNum = 6;BA.debugLine="Private deal As Boolean = False";
b4i_sockhandle._deal = b4i_main.__c.runMethod(true,"False");__ref.setField("_deal",b4i_sockhandle._deal);
 //BA.debugLineNum = 7;BA.debugLine="Private Vers As Int";
b4i_sockhandle._vers = RemoteObject.createImmutable(0);__ref.setField("_vers",b4i_sockhandle._vers);
 //BA.debugLineNum = 8;BA.debugLine="Private Cd As Int";
b4i_sockhandle._cd = RemoteObject.createImmutable(0);__ref.setField("_cd",b4i_sockhandle._cd);
 //BA.debugLineNum = 9;BA.debugLine="Private Host As String = \"\"";
b4i_sockhandle._host = BA.ObjectToString("");__ref.setField("_host",b4i_sockhandle._host);
 //BA.debugLineNum = 10;BA.debugLine="Private Port As Int = 0";
b4i_sockhandle._port = BA.numberCast(int.class, 0);__ref.setField("_port",b4i_sockhandle._port);
 //BA.debugLineNum = 11;BA.debugLine="Private ResponseData(8) As Byte";
b4i_sockhandle._responsedata = RemoteObject.createNew("B4IArray").runMethod(false, "initBytes:", (Object)new RemoteObject[] {BA.numberCast(int.class, 8)});__ref.setField("_responsedata",b4i_sockhandle._responsedata);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _sck) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sockhandle","initialize", __ref, _ba, _sck);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Sck", _sck);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(Sck As Socket)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="client = Sck";
Debug.ShouldStop(32768);
__ref.setField ("_client" /*RemoteObject*/ ,_sck);
 BA.debugLineNum = 17;BA.debugLine="inStream.Initialize(client.InputStream,client.Out";
Debug.ShouldStop(65536);
__ref.getField(false,"_instream" /*RemoteObject*/ ).runVoidMethod ("Initialize::::",__ref.getField(false, "bi"),(Object)(((__ref.getField(false,"_client" /*RemoteObject*/ ).runMethod(false,"InputStream")).getObject())),(Object)(((__ref.getField(false,"_client" /*RemoteObject*/ ).runMethod(false,"OutputStream")).getObject())),(Object)(RemoteObject.createImmutable("inStream")));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instream_error(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("inStream_Error (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,81);
if (RapidSub.canDelegate("instream_error")) { return __ref.runUserSub(false, "sockhandle","instream_error", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Private Sub inStream_Error";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _instream_newdata(RemoteObject __ref,RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("inStream_NewData (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,21);
if (RapidSub.canDelegate("instream_newdata")) { __ref.runUserSub(false, "sockhandle","instream_newdata", __ref, _buffer); return;}
ResumableSub_inStream_NewData rsub = new ResumableSub_inStream_NewData(null,__ref,_buffer);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_inStream_NewData extends BA.ResumableSub {
public ResumableSub_inStream_NewData(b4i_sockhandle parent,RemoteObject __ref,RemoteObject _buffer) {
this.parent = parent;
this.__ref = __ref;
this._buffer = _buffer;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_sockhandle parent;
RemoteObject _buffer;
RemoteObject _successful = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("inStream_NewData (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,21);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 22;BA.debugLine="If Not(deal) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 30;
if (b4i_main.__c.runMethod(true,"Not:",(Object)(__ref.getField(true,"_deal" /*RemoteObject*/ ))).getBoolean()) { 
this.state = 3;
}else {
this.state = 29;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 27;BA.debugLine="If Buffer.Length>=9 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 27;
if (RemoteObject.solveBoolean("g",_buffer.getField(true,"Length"),BA.numberCast(double.class, 9))) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 28;BA.debugLine="Vers = Buffer(0)";
Debug.ShouldStop(134217728);
__ref.setField ("_vers" /*RemoteObject*/ ,BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 0))));
 BA.debugLineNum = 29;BA.debugLine="Cd = Buffer(1)";
Debug.ShouldStop(268435456);
__ref.setField ("_cd" /*RemoteObject*/ ,BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 1))));
 BA.debugLineNum = 30;BA.debugLine="Port=Bit.ShiftLeft(Bit.And(Buffer(2),0xff),8) +";
Debug.ShouldStop(536870912);
__ref.setField ("_port" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(false,"Bit").runMethod(true,"ShiftLeft::",(Object)(b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0xff)))),(Object)(BA.numberCast(int.class, 8))),b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 3)))),(Object)(BA.numberCast(int.class, 0xff)))}, "+",1, 1));
 BA.debugLineNum = 31;BA.debugLine="Host=$\"${Bit.And(Buffer(4),0xff)}.${Bit.And(Buf";
Debug.ShouldStop(1073741824);
__ref.setField ("_host" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0xff)))))),RemoteObject.createImmutable("."),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 5)))),(Object)(BA.numberCast(int.class, 0xff)))))),RemoteObject.createImmutable("."),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 6)))),(Object)(BA.numberCast(int.class, 0xff)))))),RemoteObject.createImmutable("."),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, _buffer.runMethod(true,"getByteFast:", BA.numberCast(int.class, 7)))),(Object)(BA.numberCast(int.class, 0xff)))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 32;BA.debugLine="Log($\"Conn: ${Host}:${Port}\"$)";
Debug.ShouldStop(-2147483648);
b4i_main.__c.runVoidMethod ("LogImpl:::","37602187",(RemoteObject.concat(RemoteObject.createImmutable("Conn: "),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_host" /*RemoteObject*/ )))),RemoteObject.createImmutable(":"),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_port" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 33;BA.debugLine="If Vers=4 Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vers" /*RemoteObject*/ ),BA.numberCast(double.class, 4))) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 34;BA.debugLine="If Cd=1 Then ' connect";
Debug.ShouldStop(2);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cd" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 57;BA.debugLine="Else if Cd=2 Then ' BIND";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cd" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
this.state = 20;
}}
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 35;BA.debugLine="toServer.Initialize(\"toServer\")";
Debug.ShouldStop(4);
__ref.getField(false,"_toserver" /*RemoteObject*/ ).runVoidMethod ("Initialize:",(Object)(RemoteObject.createImmutable("toServer")));
 BA.debugLineNum = 36;BA.debugLine="toServer.Connect(Host,Port,4000)";
Debug.ShouldStop(8);
__ref.getField(false,"_toserver" /*RemoteObject*/ ).runVoidMethod ("Connect::::",__ref.getField(false, "bi"),(Object)(__ref.getField(true,"_host" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_port" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 4000)));
 BA.debugLineNum = 37;BA.debugLine="Wait For toServer_Connected (Successful As Bo";
Debug.ShouldStop(16);
b4i_main.__c.runVoidMethod ("WaitFor::::","toserver_connected:", __ref.getField(false, "bi"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sockhandle", "instream_newdata"), null);
this.state = 31;
return;
case 31:
//C
this.state = 13;
_successful = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(1));Debug.locals.put("Successful", _successful);
;
 BA.debugLineNum = 43;BA.debugLine="ResponseData(0)=0 ' version 0";
Debug.ShouldStop(1024);
__ref.getField(false,"_responsedata" /*RemoteObject*/ ).runVoidMethod ("setByteFast::", BA.numberCast(int.class, 0),BA.numberCast(byte.class, 0));
 BA.debugLineNum = 44;BA.debugLine="Bit.ArrayCopy(Buffer,2,ResponseData,2,6)";
Debug.ShouldStop(2048);
b4i_main.__c.runMethod(false,"Bit").runVoidMethod ("ArrayCopy:::::",(Object)(_buffer),(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_responsedata" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 46;BA.debugLine="If Successful Then";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//if
this.state = 18;
if (_successful.getBoolean()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 47;BA.debugLine="deal=True";
Debug.ShouldStop(16384);
__ref.setField ("_deal" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="ResponseData(1)=90 ' accept";
Debug.ShouldStop(32768);
__ref.getField(false,"_responsedata" /*RemoteObject*/ ).runVoidMethod ("setByteFast::", BA.numberCast(int.class, 1),BA.numberCast(byte.class, 90));
 BA.debugLineNum = 49;BA.debugLine="inStream.Write(ResponseData)";
Debug.ShouldStop(65536);
__ref.getField(false,"_instream" /*RemoteObject*/ ).runVoidMethod ("Write:",(Object)(__ref.getField(false,"_responsedata" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="outStream.Initialize(toServer.InputStream,to";
Debug.ShouldStop(131072);
__ref.getField(false,"_outstream" /*RemoteObject*/ ).runVoidMethod ("Initialize::::",__ref.getField(false, "bi"),(Object)(((__ref.getField(false,"_toserver" /*RemoteObject*/ ).runMethod(false,"InputStream")).getObject())),(Object)(((__ref.getField(false,"_toserver" /*RemoteObject*/ ).runMethod(false,"OutputStream")).getObject())),(Object)(RemoteObject.createImmutable("outStream")));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 52;BA.debugLine="ResponseData(1)=90 ' accept";
Debug.ShouldStop(524288);
__ref.getField(false,"_responsedata" /*RemoteObject*/ ).runVoidMethod ("setByteFast::", BA.numberCast(int.class, 1),BA.numberCast(byte.class, 90));
 BA.debugLineNum = 53;BA.debugLine="inStream.Write(ResponseData)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_instream" /*RemoteObject*/ ).runVoidMethod ("Write:",(Object)(__ref.getField(false,"_responsedata" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="Sleep(500)";
Debug.ShouldStop(2097152);
b4i_main.__c.runVoidMethod ("Sleep:::",__ref.getField(false, "bi"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sockhandle", "instream_newdata"),BA.numberCast(int.class, 500));
this.state = 32;
return;
case 32:
//C
this.state = 18;
;
 BA.debugLineNum = 55;BA.debugLine="client.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_client" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 61;BA.debugLine="Log(\"Wrong version\")";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethod ("LogImpl:::","37602216",RemoteObject.createImmutable("Wrong version"),0);
 BA.debugLineNum = 62;BA.debugLine="client.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_client" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 65;BA.debugLine="Log(\"Wrong protocol\")";
Debug.ShouldStop(1);
b4i_main.__c.runVoidMethod ("LogImpl:::","37602220",RemoteObject.createImmutable("Wrong protocol"),0);
 BA.debugLineNum = 66;BA.debugLine="client.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_client" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 71;BA.debugLine="Log(\"From client: \" & Buffer.Length)";
Debug.ShouldStop(64);
b4i_main.__c.runVoidMethod ("LogImpl:::","37602226",RemoteObject.concat(RemoteObject.createImmutable("From client: "),_buffer.getField(true,"Length")),0);
 BA.debugLineNum = 72;BA.debugLine="outStream.Write(Buffer)";
Debug.ShouldStop(128);
__ref.getField(false,"_outstream" /*RemoteObject*/ ).runVoidMethod ("Write:",(Object)(_buffer));
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _toserver_connected(RemoteObject __ref,RemoteObject _successful) throws Exception{
}
public static RemoteObject  _instream_terminated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("inStream_Terminated (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,77);
if (RapidSub.canDelegate("instream_terminated")) { return __ref.runUserSub(false, "sockhandle","instream_terminated", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub inStream_Terminated";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _outstream_error(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("outStream_Error (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,94);
if (RapidSub.canDelegate("outstream_error")) { return __ref.runUserSub(false, "sockhandle","outstream_error", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Private Sub outStream_Error";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _outstream_newdata(RemoteObject __ref,RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("outStream_NewData (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,85);
if (RapidSub.canDelegate("outstream_newdata")) { return __ref.runUserSub(false, "sockhandle","outstream_newdata", __ref, _buffer);}
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 85;BA.debugLine="private Sub outStream_NewData (Buffer() As Byte)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Log(\"From server: \" & Buffer.Length)";
Debug.ShouldStop(2097152);
b4i_main.__c.runVoidMethod ("LogImpl:::","37798785",RemoteObject.concat(RemoteObject.createImmutable("From server: "),_buffer.getField(true,"Length")),0);
 BA.debugLineNum = 87;BA.debugLine="inStream.Write(Buffer)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_instream" /*RemoteObject*/ ).runVoidMethod ("Write:",(Object)(_buffer));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _outstream_terminated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("outStream_Terminated (sockhandle) ","sockhandle",3,__ref.getField(false, "bi"),__ref,90);
if (RapidSub.canDelegate("outstream_terminated")) { return __ref.runUserSub(false, "sockhandle","outstream_terminated", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Private Sub outStream_Terminated";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}