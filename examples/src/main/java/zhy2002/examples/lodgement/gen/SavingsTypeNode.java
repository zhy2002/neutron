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

public class SavingsTypeNode extends StringUiNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsTypeNode.class;
    }

    private SavingsTypeNodeComponent component;

    @Inject
    void createComponent(SavingsTypeNodeComponent.Builder builder) {
        this.component = builder.setSavingsTypeNodeModule(new SavingsTypeNodeModule(this)).build();
    }

    @Override
    protected SavingsTypeNodeRuleProvider getRuleProvider() {
        return component.getSavingsTypeNodeRuleProvider();
    }

    public SavingsTypeNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.SAVINGS_ACCOUNT_TYPE.toArray());
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
