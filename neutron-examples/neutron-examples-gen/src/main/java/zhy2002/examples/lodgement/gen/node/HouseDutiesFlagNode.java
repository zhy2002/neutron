package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class HouseDutiesFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return HouseDutiesFlagNode.class;
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

    public HouseDutiesFlagNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

}
