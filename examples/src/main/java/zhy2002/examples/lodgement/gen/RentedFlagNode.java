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

public class RentedFlagNode extends BooleanUiNode<PropertyNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return RentedFlagNode.class;
    }

    private RentedFlagNodeComponent component;

    @Inject
    void createComponent(RentedFlagNodeComponent.Builder builder) {
        this.component = builder.setRentedFlagNodeModule(new RentedFlagNodeModule(this)).build();
    }

    @Override
    protected RentedFlagNodeRuleProvider getRuleProvider() {
        return component.getRentedFlagNodeRuleProvider();
    }

    public RentedFlagNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
