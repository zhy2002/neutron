package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TitleNode extends StringUiNode<PersonGeneralNode> {
    private TitleNodeComponent component;

    public TitleNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return TitleNode.class;
    }

    @Inject
    void createComponent(TitleNodeComponent.Builder builder) {
        this.component = builder.setTitleNodeModule(new TitleNodeModule(this)).build();
    }

    private RuleProvider<TitleNode> getRuleProvider() {
        return component.getTitleNodeRuleProvider();
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

    private RuleProvider<TitleNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
