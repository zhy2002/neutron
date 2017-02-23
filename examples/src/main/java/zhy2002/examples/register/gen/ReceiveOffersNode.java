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

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return ReceiveOffersNode.class;
    }

    private ReceiveOffersNodeComponent component;

    @Inject
    void createComponent(ReceiveOffersNodeComponent.Builder builder) {
        this.component = builder.setReceiveOffersNodeModule(new ReceiveOffersNodeModule(this)).build();
    }

    @Override
    protected ReceiveOffersNodeRuleProvider getRuleProvider() {
        return component.getReceiveOffersNodeRuleProvider();
    }

    public ReceiveOffersNode(RegisterNode parent, String name) {
        super(parent, name);
    }

}
