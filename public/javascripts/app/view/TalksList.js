Ext.define('TalkRate.view.TalksList', {
    extend:'Ext.dataview.List',
    xtype:'talkslist',
    config:{
        itemTpl: "<div class='talkitem'>{title} - {speaker}</div>"

    }
});
