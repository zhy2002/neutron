package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ApplicationTypeNode extends StringUiNode<PersonGeneralNode> {
    private ApplicationTypeNodeComponent component;

    public ApplicationTypeNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ApplicationTypeNode.class;
    }

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
