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

public class DefenseServiceFlagNode extends BooleanUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return DefenseServiceFlagNode.class;
    }

    private DefenseServiceFlagNodeComponent component;

    @Inject
    void createComponent(DefenseServiceFlagNodeComponent.Builder builder) {
        this.component = builder.setDefenseServiceFlagNodeModule(new DefenseServiceFlagNodeModule(this)).build();
    }

    @Override
    protected DefenseServiceFlagNodeRuleProvider getRuleProvider() {
        return component.getDefenseServiceFlagNodeRuleProvider();
    }

    public DefenseServiceFlagNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
