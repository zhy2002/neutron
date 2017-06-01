package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TitleNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public TitleNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TitleNode.class;
    }

    protected final TitleNodeComponent getComponent() {
        return component;
    }


    private TitleNodeComponent component;

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
