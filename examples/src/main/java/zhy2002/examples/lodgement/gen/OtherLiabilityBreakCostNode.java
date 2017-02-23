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

public class OtherLiabilityBreakCostNode extends BaseCurrencyNode<OtherLiabilityNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityBreakCostNode.class;
    }

    private OtherLiabilityBreakCostNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityBreakCostNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityBreakCostNodeModule(new OtherLiabilityBreakCostNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityBreakCostNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityBreakCostNodeRuleProvider();
    }

    public OtherLiabilityBreakCostNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
