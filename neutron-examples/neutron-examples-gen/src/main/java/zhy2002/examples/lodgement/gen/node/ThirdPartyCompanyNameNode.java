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
    protected ThirdPartyCompanyNameNode(@Owner RelatedPartyNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
