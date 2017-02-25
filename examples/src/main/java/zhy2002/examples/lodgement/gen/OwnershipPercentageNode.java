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

public class OwnershipPercentageNode extends BasePercentageNode<OwnershipNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OwnershipPercentageNode.class;
    }

    private OwnershipPercentageNodeComponent component;

    @Inject
    void createComponent(OwnershipPercentageNodeComponent.Builder builder) {
        this.component = builder.setOwnershipPercentageNodeModule(new OwnershipPercentageNodeModule(this)).build();
    }

    @Override
    protected OwnershipPercentageNodeRuleProvider getRuleProvider() {
        return component.getOwnershipPercentageNodeRuleProvider();
    }

    public OwnershipPercentageNode(OwnershipNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setValue(new BigDecimal("0"));
    }

}
