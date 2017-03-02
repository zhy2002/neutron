package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AccessCompanyNameNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessCompanyNameNode.class;
    }

    private AccessCompanyNameNodeComponent component;

    @Inject
    void createComponent(AccessCompanyNameNodeComponent.Builder builder) {
        this.component = builder.setAccessCompanyNameNodeModule(new AccessCompanyNameNodeModule(this)).build();
    }

    @Override
    protected AccessCompanyNameNodeRuleProvider getRuleProvider() {
        return component.getAccessCompanyNameNodeRuleProvider();
    }

    public AccessCompanyNameNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
