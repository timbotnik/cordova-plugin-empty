#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>


@interface PSEmpty : CDVPlugin {}


/* Exec API */
- (void)doNothing:(CDVInvokedUrlCommand*)command;

@end;
