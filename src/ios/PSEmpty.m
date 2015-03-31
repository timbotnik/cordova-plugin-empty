#import <Cordova/CDV.h>
#import "PSEmpty.h"

@implementation PSEmpty

- (void)pluginInitialize
{
    NSLog(@"Empty plugin initialized");
}

- (void)dealloc
{
}

- (void)onReset
{
}

- (void)pageDidLoad:(NSNotification*)notification
{
    NSLog(@"Empty page loaded");
}

- (void)doNothing:(CDVInvokedUrlCommand*)command
{
    NSLog(@"Empty plugin did absolutely nothing.");
    CDVPluginResult* result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end;