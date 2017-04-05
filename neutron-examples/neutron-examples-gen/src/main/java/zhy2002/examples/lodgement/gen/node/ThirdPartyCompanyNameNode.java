package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyCompanyNameNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyCompanyNameNode.class;
    }

    private ThirdPartyCompanyNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyCompanyNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyCompanyNameNodeModule(new ThirdPartyCompanyNameNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyCompanyNameNode> getRuleProvider() {
        return component.getThirdPartyCompanyNameNodeRuleProvider();
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

    private RuleProvider<ThirdPartyCompanyNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ThirdPartyCompanyNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
