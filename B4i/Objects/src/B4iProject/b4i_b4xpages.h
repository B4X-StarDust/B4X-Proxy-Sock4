#import "iCore.h"
#import "iRandomAccessFile.h"
#import "iNetwork.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
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
@class b4i_b4xpagesmanager;
@interface b4i_b4xpages : B4IStaticModule
{
@public NSObject* __mpm;
@public b4i_b4xpagesdelegator* __delegate;
@public NSObject* __globalcontext;
@public b4i_main* __main;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _addpage:(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _addpageandcreate:(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _closepage:(NSObject*) _b4xpage;
- (b4i_b4xpagesmanager*)  _getmanager;
- (B4IPage*)  _getnativeparent:(NSObject*) _b4xpage;
- (NSObject*)  _getpage:(NSString*) _id;
- (NSString*)  _getpageid:(NSObject*) _b4xpage;
- (NSString*)  _internalsetpagesmanager:(NSObject*) _pm;
- (BOOL)  _isinitialized;
- (b4i_b4xmainpage*)  _mainpage;
- (NSString*)  _process_globals;
@property (nonatomic)NSObject* _mpm;
@property (nonatomic)b4i_b4xpagesdelegator* _delegate;
@property (nonatomic)NSObject* _globalcontext;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _settitle:(NSObject*) _b4xpage :(NSObject*) _title;
- (NSString*)  _showpage:(NSString*) _id;
- (NSString*)  _showpageandremovepreviouspages:(NSString*) _id;
@end
