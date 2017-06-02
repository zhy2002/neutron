package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LegalActionNode extends YesNoOptionNode<BasePrivacyNode<?>> {

    @Inject
    protected LegalActionNode(@Owner BasePrivacyNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LegalActionNode.class;
    }

    protected final LegalActionNodeComponent getComponent() {
        return component;
    }


    private LegalActionNodeComponent component;

    @Inject
    void createComponent(LegalActionNodeComponent.Builder builder) {
        this.component = builder.setLegalActionNodeModule(new LegalActionNodeModule(this)).build();
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
