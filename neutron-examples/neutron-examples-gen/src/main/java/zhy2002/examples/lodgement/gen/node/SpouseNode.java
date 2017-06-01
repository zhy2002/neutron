package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SpouseNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SpouseNode extends ReferenceUiNode<PersonGeneralNode> {

    @Inject
    public SpouseNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SpouseNode.class;
    }

    protected final SpouseNodeComponent getComponent() {
        return component;
    }


    private SpouseNodeComponent component;

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
