qx.Class.define( "com.maisha.wind.faces.rap.mask.MaskedText", {
    extend: qx.ui.layout.CanvasLayout,
    
    construct: function( id ) {
        this.base( arguments );
        this.setHtmlAttribute( "id", id );
        this.setHtmlAttribute("name",  id );
        this._id = id;
        this.addEventListener( "appear", this.init, this );	       
    },
    
    properties : {
        mask : {
            init : "",
            apply : "load"
        },
        text : {
        	init : "",
            apply : "loadText"
        }
    },
    
    members : {
    	init : function(){
           this._element = document.getElementById(this._id).firstChild.children[1].firstChild;
           this._element.setAttribute("name", this._id + "iptText");
           this._element.setAttribute("id", this._id + "iptText");                     
           oNumberMask = new Mask(this.getMask(), this._id);
           oNumberMask.attach(this._element);
    	},
    
        load : function() {
        },
        
        loadText: function(){

        }
    }
    
} );