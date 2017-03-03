package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected ThirdPartyCompanyNameNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyCompanyNameNodeRuleProvider();
    }

    public ThirdPartyCompanyNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
