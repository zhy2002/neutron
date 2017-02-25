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

public class OtherLiabilityMonthlyRepaymentNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityMonthlyRepaymentNode.class;
    }

    private OtherLiabilityMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityMonthlyRepaymentNodeModule(new OtherLiabilityMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityMonthlyRepaymentNodeRuleProvider();
    }

    public OtherLiabilityMonthlyRepaymentNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
