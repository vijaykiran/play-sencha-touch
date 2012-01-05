/*
@class TalkList View
*/

Ext.define('TalkRate.view.Talks', {
    extend:'Ext.NavigationView',
    requires:["TalkRate.view.TalksList"],
    config:{
        fullscreen: true,
        items: [
          {
            title: 'Talks',
            items: [{
                xtype: 'talkslist'
            }]
        }]
    }
});
