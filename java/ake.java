/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AutoCompleteTextView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class ake
extends AutoCompleteTextView
implements rr {
    private static final int[] a = new int[]{16843126};
    private akj b;
    private akf c;
    private alh d;

    public ake(Context context) {
        super(context, null);
    }

    public ake(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.m);
    }

    public ake(Context context, AttributeSet attributeSet, int n) {
        super(aqf.a(context), attributeSet, n);
        this.b = akj.a();
        aqi aqi2 = aqi.a(this.getContext(), attributeSet, a, n);
        if (aqi2.e(0)) {
            this.setDropDownBackgroundDrawable(aqi2.a(0));
        }
        aqi2.a.recycle();
        this.c = new akf((View)this, this.b);
        this.c.a(attributeSet, n);
        this.d = alh.a((TextView)this);
        this.d.a(attributeSet, n);
        this.d.a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override
    public ColorStateList getSupportBackgroundTintList() {
        if (this.c != null) {
            return this.c.a();
        }
        return null;
    }

    @Override
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.c != null) {
            return this.c.b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c != null) {
            this.c.b(null);
        }
    }

    public void setBackgroundResource(int n) {
        super.setBackgroundResource(n);
        if (this.c != null) {
            this.c.a(n);
        }
    }

    public void setDropDownBackgroundResource(int n) {
        if (this.b != null) {
            this.setDropDownBackgroundDrawable(this.b.a(this.getContext(), n, false));
            return;
        }
        super.setDropDownBackgroundResource(n);
    }

    @Override
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    @Override
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    public void setTextAppearance(Context context, int n) {
        super.setTextAppearance(context, n);
        if (this.d != null) {
            this.d.a(context, n);
        }
    }
}

