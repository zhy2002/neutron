package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.GenderNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class GenderNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public GenderNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return GenderNode.class;
    }

    protected final GenderNodeComponent getComponent() {
        return component;
    }


    private GenderNodeComponent component;

    @Inject
    void createComponent(GenderNodeComponent.Builder builder) {
        this.component = builder.setGenderNodeModule(new GenderNodeModule(this)).build();
    }

    private RuleProvider<GenderNode> getRuleProvider() {
        return component.getGenderNodeRuleProvider();
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

    private RuleProvider<GenderNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
