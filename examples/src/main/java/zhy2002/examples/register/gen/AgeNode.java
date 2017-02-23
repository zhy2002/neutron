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
import zhy2002.examples.register.gen.di.*;

public class AgeNode extends BigDecimalUiNode<RegisterNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AgeNode.class;
    }

    private AgeNodeComponent component;

    @Inject
    void createComponent(AgeNodeComponent.Builder builder) {
        this.component = builder.setAgeNodeModule(new AgeNodeModule(this)).build();
    }

    @Override
    protected AgeNodeRuleProvider getRuleProvider() {
        return component.getAgeNodeRuleProvider();
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

}
