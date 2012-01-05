Ext.define('TalkRate.view.Talks', {
    extend:'Ext.NavigationView',
    requires:["TalkRate.view.TalksList"],
    xtype:'talks',
    config:{
        fullscreen:false,
        navigationBar: {
            items:[
                {
                    xtype: 'button',
                    id: 'addTalk',
                    text: 'Add'
                }]
        },
        items:[
            {
                xtype:'talkslist',
                title:'Talks',
                store:'TalkStore'
            }
        ]
    }
});
