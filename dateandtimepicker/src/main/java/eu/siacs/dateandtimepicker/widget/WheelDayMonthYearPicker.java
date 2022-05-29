package eu.siacs.dateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;

import java.util.HashMap;
import java.util.List;

public class WheelDayMonthYearPicker extends WheelPicker<String>{
    public WheelDayMonthYearPicker(Context context) {
        super(context);
    }

    public WheelDayMonthYearPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void init() {

    }

    @Override
    protected String initDefault() {
        return null;
    }

    @Override
    protected List<String> generateAdapterValues(boolean showOnlyFutureDates) {

        HashMap <Integer,String> hash=new HashMap<>();

        return null;
    }
}
