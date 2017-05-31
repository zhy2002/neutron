package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SpouseNode extends ReferenceUiNode<PersonGeneralNode> {
    private SpouseNodeComponent component;

    public SpouseNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SpouseNode.class;
    }

    @Inject
    void createComponent(SpouseNodeComponent.Builder builder) {
        this.component = builder.setSpouseNodeModule(new SpouseNodeModule(this)).build();
    }

    private RuleProvider<SpouseNode> getRuleProvider() {
        return component.getSpouseNodeRuleProvider();
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

    private RuleProvider<SpouseNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
