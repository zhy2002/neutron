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

public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OwnInvestmentPropertyNode.class;
    }

    private OwnInvestmentPropertyNodeComponent component;

    @Inject
    void createComponent(OwnInvestmentPropertyNodeComponent.Builder builder) {
        this.component = builder.setOwnInvestmentPropertyNodeModule(new OwnInvestmentPropertyNodeModule(this)).build();
    }

    @Override
    protected OwnInvestmentPropertyNodeRuleProvider getRuleProvider() {
        return component.getOwnInvestmentPropertyNodeRuleProvider();
    }

    public OwnInvestmentPropertyNode(RegisterNode parent, String name) {
        super(parent, name);
    }

}
