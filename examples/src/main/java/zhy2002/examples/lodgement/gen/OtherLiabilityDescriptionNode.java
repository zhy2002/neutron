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

public class OtherLiabilityDescriptionNode extends StringUiNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityDescriptionNode.class;
    }

    private OtherLiabilityDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityDescriptionNodeModule(new OtherLiabilityDescriptionNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityDescriptionNodeRuleProvider();
    }

    public OtherLiabilityDescriptionNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
