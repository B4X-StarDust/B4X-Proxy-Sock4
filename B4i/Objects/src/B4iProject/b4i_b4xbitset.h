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
@class b4i_b4xbytesbuilder;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xbitset : B4IClass
{
@public B4IArray* __data;
@public int __msize;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals:(b4i_b4xbitset*) __ref;
@property (nonatomic)B4IArray* _data;
@property (nonatomic)int _msize;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear:(b4i_b4xbitset*) __ref;
- (BOOL)  _get:(b4i_b4xbitset*) __ref :(int) _index;
- (int)  _getsize:(b4i_b4xbitset*) __ref;
- (NSString*)  _initialize:(b4i_b4xbitset*) __ref :(B4I*) _ba :(int) _size;
- (NSString*)  _set:(b4i_b4xbitset*) __ref :(int) _index :(BOOL) _value;
@end
