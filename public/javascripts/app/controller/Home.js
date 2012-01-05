Ext.define('TalkRate.controller.Home', {
    extend:'Ext.app.Controller',

    views:['Talks'],
    stores: ['TalkStore'],

    init:function () {
        this.getTalksView().create();

        this.control({
            '.talkitem': {
                'tap': function (comp) {
                    console.log(comp);
                }
            }
        });
    }
});
