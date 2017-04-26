package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OccupationNode extends BaseOccupationNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OccupationNode.class;
    }

    private OccupationNodeComponent component;

    @Inject
    void createComponent(OccupationNodeComponent.Builder builder) {
        this.component = builder.setOccupationNodeModule(new OccupationNodeModule(this)).build();
    }

    private RuleProvider<OccupationNode> getRuleProvider() {
        return component.getOccupationNodeRuleProvider();
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

    private RuleProvider<OccupationNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OccupationNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
