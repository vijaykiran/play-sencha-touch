Ext.define('TalkRate.view.TalksList', {
    extend:'Ext.dataview.List',
    xtype:'talkslist',
    config:{
        store: 'TalkRate.model.Talks'
    }
});
