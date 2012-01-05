Ext.define('TalkRate.controller.Home', {
    extend:'Ext.app.Controller',

    views:['Talks'],
    stores: ['TalkStore'],

    init:function () {
        this.getTalksView().create();

        this.control({
            'button#addTalk':{
                'tap':this.showTalkForm
            }
        });
    },

    showTalkForm:function () {
        var talk = Ext.create('TalkRate.model.Talk', { title:"Play Squeryl"});
        talk.save();
        this.getTalkStoreStore().load();
    }
});

