qx.Class.define( "com.maisha.wind.faces.rap.mask.MaskedText", {
    extend: qx.ui.form.TextField,
    
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
        }
    },
    
    members : {
    	init : function(){
           this._element = document.getElementById(this._id).firstChild;
           this._element.setAttribute("name", this._id);
           this._element.setAttribute("id", this._id);                     
           oNumberMask = new Mask("$#,###.00", this._id);
           oNumberMask.attach(this._element);
           
    	   
    	},
    
        load : function() {

        }
    }
    
} );