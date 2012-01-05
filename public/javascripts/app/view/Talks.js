Ext.define('TalkRate.view.Talks', {
    extend:'Ext.NavigationView',
    requires:["TalkRate.view.TalksList"],
    xtype:'talks',
    config:{
        fullscreen:false,
        items:[
            {
                xtype:'talkslist',
                title:'Talks',
                store:'TalkStore'
            }
        ]
    }
});
