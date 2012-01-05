Ext.define('TalkRate.model.Talk', {
    extend:'Ext.data.Model',
    fields:[
        {name:"id", type:"int"},
        {name:"title", type:"string"},
        {name:"date", type:"date"},
        {name:"speaker", type:"string"}
    ],

    proxy:{
        type:'rest',
        url:'/talks',

        reader:{
            type:'json',
            root:'items'
        }
    }
});