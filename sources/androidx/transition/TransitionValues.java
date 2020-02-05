package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionValues {
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();
    public final Map<String, Object> values = new HashMap();
    public View view;

    @Deprecated
    public TransitionValues() {
    }

    public TransitionValues(@NonNull View view2) {
        this.view = view2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.view + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + "    values:";
        for (String next : this.values.keySet()) {
            str = str + "    " + next + ": " + this.values.get(next) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return str;
    }
}