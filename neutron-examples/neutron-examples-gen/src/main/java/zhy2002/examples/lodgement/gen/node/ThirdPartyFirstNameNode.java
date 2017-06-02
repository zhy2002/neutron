package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyFirstNameNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyFirstNameNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyFirstNameNode.class;
    }

    protected final ThirdPartyFirstNameNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyFirstNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyFirstNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyFirstNameNodeModule(new ThirdPartyFirstNameNodeModule(this)).build();
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
