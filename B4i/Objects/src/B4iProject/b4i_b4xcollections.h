#import "iCore.h"
#import "iRandomAccessFile.h"
#import "iNetwork.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
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
@interface b4i_b4xcollections : B4IStaticModule
{
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;

}- (b4i_b4xbitset*)  _createbitset:(int) _size;
- (b4i_b4xorderedmap*)  _createorderedmap;
- (b4i_b4xorderedmap*)  _createorderedmap2:(B4IList*) _keys :(B4IList*) _values;
- (b4i_b4xset*)  _createset;
- (b4i_b4xset*)  _createset2:(B4IList*) _values;
- (NSString*)  _process_globals;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@end
