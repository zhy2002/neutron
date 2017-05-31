package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LegalActionNode extends YesNoOptionNode<BasePrivacyNode<?>> {
    private LegalActionNodeComponent component;

    public LegalActionNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LegalActionNode.class;
    }

    @Inject
    void createComponent(LegalActionNodeComponent.Builder builder) {
        this.component = builder.setLegalActionNodeModule(new LegalActionNodeModule(this)).build();
    }

    private RuleProvider<LegalActionNode> getRuleProvider() {
        return component.getLegalActionNodeRuleProvider();
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

    private RuleProvider<LegalActionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
