package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FirstHomeBuyerFlagNode extends BooleanUiNode<PersonGeneralNode> {
    private FirstHomeBuyerFlagNodeComponent component;

    public FirstHomeBuyerFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return FirstHomeBuyerFlagNode.class;
    }

    @Inject
    void createComponent(FirstHomeBuyerFlagNodeComponent.Builder builder) {
        this.component = builder.setFirstHomeBuyerFlagNodeModule(new FirstHomeBuyerFlagNodeModule(this)).build();
    }

    private RuleProvider<FirstHomeBuyerFlagNode> getRuleProvider() {
        return component.getFirstHomeBuyerFlagNodeRuleProvider();
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

    private RuleProvider<FirstHomeBuyerFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
