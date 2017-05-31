package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class HousingStatusNode extends StringUiNode<PersonGeneralNode> {
    private HousingStatusNodeComponent component;

    public HousingStatusNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return HousingStatusNode.class;
    }

    @Inject
    void createComponent(HousingStatusNodeComponent.Builder builder) {
        this.component = builder.setHousingStatusNodeModule(new HousingStatusNodeModule(this)).build();
    }

    private RuleProvider<HousingStatusNode> getRuleProvider() {
        return component.getHousingStatusNodeRuleProvider();
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

    private RuleProvider<HousingStatusNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
