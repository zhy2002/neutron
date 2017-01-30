package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class DobNode<P extends ParentUiNode<?>> extends StringUiNode<P>
{
    protected DobNode(P parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinAge(18);
        setMaxAge(100);
    }

    @JsMethod
    public Integer getMinAge() {
        return getStateValue(ApplicationNodeConstants.MIN_AGE);
    }

    @JsMethod
    public void setMinAge(Integer value) {
        setStateValue(ApplicationNodeConstants.MIN_AGE, Integer.class, value);
    }

    @JsMethod
    public Integer getMaxAge() {
        return getStateValue(ApplicationNodeConstants.MAX_AGE);
    }

    @JsMethod
    public void setMaxAge(Integer value) {
        setStateValue(ApplicationNodeConstants.MAX_AGE, Integer.class, value);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(DobRangeValidationRule.class, this));
    }



}
