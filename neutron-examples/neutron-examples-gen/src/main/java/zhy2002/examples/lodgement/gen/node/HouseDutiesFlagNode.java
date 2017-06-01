package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.HouseDutiesFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class HouseDutiesFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Inject
    public HouseDutiesFlagNode(@Owner UnemployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return HouseDutiesFlagNode.class;
    }

    protected final HouseDutiesFlagNodeComponent getComponent() {
        return component;
    }


    private HouseDutiesFlagNodeComponent component;

    @Inject
    void createComponent(HouseDutiesFlagNodeComponent.Builder builder) {
        this.component = builder.setHouseDutiesFlagNodeModule(new HouseDutiesFlagNodeModule(this)).build();
    }

    private RuleProvider<HouseDutiesFlagNode> getRuleProvider() {
        return component.getHouseDutiesFlagNodeRuleProvider();
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

    private RuleProvider<HouseDutiesFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
