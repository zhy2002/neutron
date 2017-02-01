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

public  class PersonOtherIncomeTypeNode extends StringUiNode<PersonOtherIncomeNode>
{
    protected PersonOtherIncomeTypeNode(PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.OTHER_INCOME_TYPE.toArray());
        setRequired(true);
        setValue("Other Income");
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(PersonOtherIncomeTypeChangeRule.class, this));
    }



}
