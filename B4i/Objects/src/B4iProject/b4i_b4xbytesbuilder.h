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
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xbytesbuilder : B4IClass
{
@public B4IArray* __mbuffer;
@public int __mlength;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (b4i_b4xbytesbuilder*)  _append:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _data;
- (b4i_b4xbytesbuilder*)  _append2:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _data :(int) _startindex :(int) _length;
- (int)  _changelength:(b4i_b4xbytesbuilder*) __ref :(int) _newlength;
- (NSString*)  _class_globals:(b4i_b4xbytesbuilder*) __ref;
@property (nonatomic)B4IArray* _mbuffer;
@property (nonatomic)int _mlength;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear:(b4i_b4xbytesbuilder*) __ref;
- (B4IArray*)  _getinternalbuffer:(b4i_b4xbytesbuilder*) __ref;
- (int)  _getlength:(b4i_b4xbytesbuilder*) __ref;
- (int)  _indexof:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _searchfor;
- (int)  _indexof2:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _searchfor :(int) _index;
- (NSString*)  _initialize:(b4i_b4xbytesbuilder*) __ref :(B4I*) _ba;
- (NSString*)  _insert:(b4i_b4xbytesbuilder*) __ref :(int) _index :(B4IArray*) _data;
- (B4IArray*)  _remove:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex :(int) _endindex;
- (NSString*)  _set:(b4i_b4xbytesbuilder*) __ref :(int) _index :(B4IArray*) _data;
- (B4IArray*)  _subarray:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex;
- (B4IArray*)  _subarray2:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex :(int) _endindex;
- (B4IArray*)  _toarray:(b4i_b4xbytesbuilder*) __ref;
@end
