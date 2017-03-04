package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CreditCardTypeNode extends StringUiNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardTypeNode.class;
    }

    private CreditCardTypeNodeComponent component;

    @Inject
    void createComponent(CreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setCreditCardTypeNodeModule(new CreditCardTypeNodeModule(this)).build();
    }

    @Override
    protected CreditCardTypeNodeRuleProvider getRuleProvider() {
        return component.getCreditCardTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CreditCardTypeNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.CREDIT_CARD_TYPE.toArray());
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
