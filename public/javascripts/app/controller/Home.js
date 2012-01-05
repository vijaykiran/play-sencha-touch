Ext.define('TalkRate.controller.Home', {
    extend:'Ext.app.Controller',
    views:['Talks'],
    stores: ['TalkStore'],

    init:function () {
        this.getTalksView().create();
    }
});
