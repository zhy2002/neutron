package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;

public class AgeNode extends BigDecimalUiNode<RegisterNode>
{
    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<AgeNode> config = classRegistry.getUiNodeConfig(AgeNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public AgeNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
        setMaxValue(new BigDecimal("120"));
        setRangeMessage("Age must be between 0 and 120.");
    }

    @Inject
    AgeNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
