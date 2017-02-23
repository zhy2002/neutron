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

public class AdditionalNode extends ObjectUiNode<ApplicationNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AdditionalNode.class;
    }

    private AdditionalNodeComponent component;

    @Inject
    void createComponent(AdditionalNodeComponent.Builder builder) {
        this.component = builder.setAdditionalNodeModule(new AdditionalNodeModule(this)).build();
    }

    @Override
    protected AdditionalNodeRuleProvider getRuleProvider() {
        return component.getAdditionalNodeRuleProvider();
    }

    public AdditionalNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

}
