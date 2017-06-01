package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyCompanyNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyCompanyNameNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyCompanyNameNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyCompanyNameNode.class;
    }

    protected final ThirdPartyCompanyNameNodeComponent getComponent() {
        return component;
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

}
