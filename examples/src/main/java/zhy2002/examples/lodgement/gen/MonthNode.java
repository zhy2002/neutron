package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class MonthNode extends BigDecimalUiNode<MonthYearNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return MonthNode.class;
    }

    private MonthNodeComponent component;

    @Inject
    void createComponent(MonthNodeComponent.Builder builder) {
        this.component = builder.setMonthNodeModule(new MonthNodeModule(this)).build();
    }

    @Override
    protected MonthNodeRuleProvider getRuleProvider() {
        return component.getMonthNodeRuleProvider();
    }

    public MonthNode(@NotNull MonthYearNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
        setOptions(ApplicationNodeConstants.MONTH_TYPE.toArray());
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
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
