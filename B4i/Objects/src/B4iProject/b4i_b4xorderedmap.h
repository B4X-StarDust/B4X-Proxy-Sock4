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
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xorderedmap : B4IClass
{
@public B4IMap* __map;
@public B4IList* __list;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals:(b4i_b4xorderedmap*) __ref;
@property (nonatomic)B4IMap* _map;
@property (nonatomic)B4IList* _list;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear:(b4i_b4xorderedmap*) __ref;
- (BOOL)  _containskey:(b4i_b4xorderedmap*) __ref :(NSObject*) _key;
- (NSObject*)  _get:(b4i_b4xorderedmap*) __ref :(NSObject*) _key;
- (NSObject*)  _getdataforserializator:(b4i_b4xorderedmap*) __ref;
- (NSObject*)  _getdefault:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _defaultvalue;
- (B4IList*)  _getkeys:(b4i_b4xorderedmap*) __ref;
- (int)  _getsize:(b4i_b4xorderedmap*) __ref;
- (B4IList*)  _getvalues:(b4i_b4xorderedmap*) __ref;
- (NSString*)  _initialize:(b4i_b4xorderedmap*) __ref :(B4I*) _ba;
- (NSString*)  _put:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _value;
- (NSString*)  _remove:(b4i_b4xorderedmap*) __ref :(NSObject*) _key;
- (NSString*)  _setdatafromserializator:(b4i_b4xorderedmap*) __ref :(NSObject*) _data;
@end
