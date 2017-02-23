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

public class OtherLiabilityAmountOwningNode extends BaseCurrencyNode<OtherLiabilityNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityAmountOwningNode.class;
    }

    private OtherLiabilityAmountOwningNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityAmountOwningNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityAmountOwningNodeModule(new OtherLiabilityAmountOwningNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityAmountOwningNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityAmountOwningNodeRuleProvider();
    }

    public OtherLiabilityAmountOwningNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
