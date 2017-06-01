package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessCompanyNameNode extends StringUiNode<AccessNode> {

    private AccessCompanyNameNodeComponent component;

    @Inject
    public AccessCompanyNameNode(@Owner AccessNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessCompanyNameNode.class;
    }

    @Inject
    void createComponent(AccessCompanyNameNodeComponent.Builder builder) {
        this.component = builder.setAccessCompanyNameNodeModule(new AccessCompanyNameNodeModule(this)).build();
    }

    private RuleProvider<AccessCompanyNameNode> getRuleProvider() {
        return component.getAccessCompanyNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<AccessCompanyNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
