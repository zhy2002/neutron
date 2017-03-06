package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class YesNoOptionNode<P extends ParentUiNode<?>> extends StringUiNode<P> {


    public YesNoOptionNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
