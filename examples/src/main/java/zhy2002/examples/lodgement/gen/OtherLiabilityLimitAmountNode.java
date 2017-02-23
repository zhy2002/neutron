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

public class OtherLiabilityLimitAmountNode extends BaseCurrencyNode<OtherLiabilityNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityLimitAmountNode.class;
    }

    private OtherLiabilityLimitAmountNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityLimitAmountNodeModule(new OtherLiabilityLimitAmountNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityLimitAmountNodeRuleProvider();
    }

    public OtherLiabilityLimitAmountNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
