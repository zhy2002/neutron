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


public class TrustTypeNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustTypeNode.class;
    }

    private TrustTypeNodeComponent component;

    @Inject
    void createComponent(TrustTypeNodeComponent.Builder builder) {
        this.component = builder.setTrustTypeNodeModule(new TrustTypeNodeModule(this)).build();
    }

    @Override
    protected TrustTypeNodeRuleProvider getRuleProvider() {
        return component.getTrustTypeNodeRuleProvider();
    }

    public TrustTypeNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.TRUST_TYPE.toArray());
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
