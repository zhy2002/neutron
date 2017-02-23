package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class OtherLiabilityClearingFlagNode extends BooleanUiNode<OtherLiabilityNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityClearingFlagNode.class;
    }

    private OtherLiabilityClearingFlagNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityClearingFlagNodeModule(new OtherLiabilityClearingFlagNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityClearingFlagNodeRuleProvider();
    }

    public OtherLiabilityClearingFlagNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
