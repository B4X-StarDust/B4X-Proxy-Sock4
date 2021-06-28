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
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xpagesdelegator : B4IClass
{
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _activity_pause:(b4i_b4xpagesdelegator*) __ref;
- (NSString*)  _activity_resume:(b4i_b4xpagesdelegator*) __ref;
- (NSString*)  _class_globals:(b4i_b4xpagesdelegator*) __ref;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _initialize:(b4i_b4xpagesdelegator*) __ref :(B4I*) _ba;
- (NSString*)  _mainform_resize:(b4i_b4xpagesdelegator*) __ref :(double) _width :(double) _height;
@end
