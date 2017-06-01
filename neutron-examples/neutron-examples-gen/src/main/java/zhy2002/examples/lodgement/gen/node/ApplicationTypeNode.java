package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ApplicationTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ApplicationTypeNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public ApplicationTypeNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ApplicationTypeNode.class;
    }

    protected final ApplicationTypeNodeComponent getComponent() {
        return component;
    }


    private ApplicationTypeNodeComponent component;

    @Inject
    void createComponent(ApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setApplicationTypeNodeModule(new ApplicationTypeNodeModule(this)).build();
    }

    private RuleProvider<ApplicationTypeNode> getRuleProvider() {
        return component.getApplicationTypeNodeRuleProvider();
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

    private RuleProvider<ApplicationTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
