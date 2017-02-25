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

public class EstimatedMarketValueNode extends BigDecimalUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EstimatedMarketValueNode.class;
    }

    private EstimatedMarketValueNodeComponent component;

    @Inject
    void createComponent(EstimatedMarketValueNodeComponent.Builder builder) {
        this.component = builder.setEstimatedMarketValueNodeModule(new EstimatedMarketValueNodeModule(this)).build();
    }

    @Override
    protected EstimatedMarketValueNodeRuleProvider getRuleProvider() {
        return component.getEstimatedMarketValueNodeRuleProvider();
    }

    public EstimatedMarketValueNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
