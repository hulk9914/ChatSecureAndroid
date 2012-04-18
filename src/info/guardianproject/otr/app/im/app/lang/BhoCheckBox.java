package info.guardianproject.otr.app.im.app.lang;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class BhoCheckBox extends CheckBox {
	Context c;
	private static Typeface t;
	
	public BhoCheckBox(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.c = context;
		
		if(t == null)
			t = Typeface.createFromAsset(this.c.getAssets(), BhoTyper.FONT);
		
		setTypeface(t);
		
	}
	
	public BhoCheckBox(Context context) {
		super(context);
		this.c = context;
		
		if(t == null)
			t = Typeface.createFromAsset(this.c.getAssets(), BhoTyper.FONT);
		
		setTypeface(t);
	}
	
	@Override
	public void setTypeface(Typeface typeface) {
		super.setTypeface(typeface);
	}

}
