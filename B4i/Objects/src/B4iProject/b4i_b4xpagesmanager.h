#import "iCore.h"
#import "iRandomAccessFile.h"
#import "iNetwork.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_proxysocks4;
@class b4i_sockhandle;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@interface b4i_b4xpagesmanager : B4IClass
{
@public b4i_b4xorderedmap* __idtob4xpage;
@public b4i_b4xorderedmap* __rootb4xtopage;
@public b4i_b4xset* __mstackofpageids;
@public B4IXUI* __xui;
@public B4INavigationControllerWrapper* __mmainform;
@public BOOL __isforeground;
@public int __transitionanimationduration;
@public b4i_b4xmainpage* __mainpage;
@public NSString* __stackstring;
@public BOOL __logevents;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _activity_pause:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _activity_resume:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _addpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _addpageandcreate:(b4i_b4xpagesmanager*) __ref :(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _b4ipage_appear:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _b4ipage_barbuttonclick:(b4i_b4xpagesmanager*) __ref :(NSString*) _tag;
- (NSString*)  _b4ipage_disappear:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _b4ipage_keyboardstatechanged:(b4i_b4xpagesmanager*) __ref :(float) _height;
- (NSString*)  _b4ipage_resize:(b4i_b4xpagesmanager*) __ref :(float) _width :(float) _height;
- (NSString*)  _backgroundstatechanged:(b4i_b4xpagesmanager*) __ref :(BOOL) _newstate;
- (NSString*)  _class_globals:(b4i_b4xpagesmanager*) __ref;
@property (nonatomic)b4i_b4xorderedmap* _idtob4xpage;
@property (nonatomic)b4i_b4xorderedmap* _rootb4xtopage;
@property (nonatomic)b4i_b4xset* _mstackofpageids;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4INavigationControllerWrapper* _mmainform;
@property (nonatomic)BOOL _isforeground;
@property (nonatomic)int _transitionanimationduration;
@property (nonatomic)b4i_b4xmainpage* _mainpage;
@property (nonatomic)NSString* _stackstring;
@property (nonatomic)BOOL _logevents;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _closepage:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage;
- (NSString*)  _closepageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi;
- (_b4xpageinfo*)  _createb4xpageinfo:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage :(NSString*) _id :(BOOL) _created :(NSObject*) _title;
- (_b4xpageparent*)  _createb4xpageparent:(b4i_b4xpagesmanager*) __ref :(B4IPage*) _nativetype;
- (NSString*)  _createpageifneeded:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi;
- (NSString*)  _createpageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi;
- (_b4xpageinfo*)  _findpifromb4xpage:(b4i_b4xpagesmanager*) __ref :(NSObject*) _page;
- (NSObject*)  _getpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id;
- (_b4xpageinfo*)  _getpagefromid:(b4i_b4xpagesmanager*) __ref :(NSString*) _id;
- (_b4xpageinfo*)  _getpageinfofromroot:(b4i_b4xpagesmanager*) __ref :(B4XViewWrapper*) _root;
- (_b4xpageinfo*)  _gettoppage:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _initialize:(b4i_b4xpagesmanager*) __ref :(B4I*) _ba :(B4INavigationControllerWrapper*) _navcontrol;
- (NSString*)  _logevent:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi :(NSString*) _ev;
- (NSString*)  _mainform_resize:(b4i_b4xpagesmanager*) __ref :(double) _width :(double) _height;
- (NSString*)  _raiseevent:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params;
- (NSObject*)  _raiseeventwithresult:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params;
- (NSString*)  _settitle:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage :(NSObject*) _title;
- (NSString*)  _showpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id;
- (NSString*)  _showpageandremovepreviouspages:(b4i_b4xpagesmanager*) __ref :(NSString*) _id;
- (NSString*)  _showpageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi;
- (NSString*)  _toppageappear:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _toppagedisappear:(b4i_b4xpagesmanager*) __ref;
- (NSString*)  _updatestackstring:(b4i_b4xpagesmanager*) __ref;
@end
@interface _b4xpageparent:NSObject
{
@public BOOL _IsInitialized;
@public B4IPage* _NativeType;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)B4IPage* NativeType;
-(void)Initialize;
@end
@interface _b4xpageinfo:NSObject
{
@public BOOL _IsInitialized;
@public NSObject* _B4XPage;
@public NSString* _Id;
@public BOOL _Created;
@public NSObject* _Title;
@public B4XViewWrapper* _Root;
@public BOOL _IsFirst;
@public _b4xpageparent* _Parent;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSObject* B4XPage;
@property (nonatomic)NSString* Id;
@property (nonatomic)BOOL Created;
@property (nonatomic)NSObject* Title;
@property (nonatomic)B4XViewWrapper* Root;
@property (nonatomic)BOOL IsFirst;
@property (nonatomic)_b4xpageparent* Parent;
-(void)Initialize;
@end
