Ext.define('TalkRate.controller.Home', {
    extend:'Ext.app.Controller',
    statics: {
        count: 0
    },
    views:['Talks'],
    stores:['TalkStore'],

    init:function () {
        this.getTalksView().create();

        this.control({
            'button#addTalk':{
                'tap':this.showTalkForm
            }
        });
    },

    showTalkForm:function () {
        var me = this;
        var talk = Ext.create('TalkRate.model.Talk',
                                {
                                    title:"Play! Topic  " +  me.self.count,
                                    speaker: 'Player  ' + me.self.count++
                                });

        talk.save({
            success:function () {
                me.getTalkStoreStore().load();
            }
        });

    }
});

