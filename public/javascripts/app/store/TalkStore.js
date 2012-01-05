Ext.define('TalkRate.store.TalkStore', {
    extend:'Ext.data.Store',
    model:'TalkRate.model.Talk',
    requires:['TalkRate.model.Talk'],

    autoLoad:true,

    proxy:{
        type:'ajax',
        url:'/talks',

        reader:{
            type:'json',
            root:'items'
        }
    }
});