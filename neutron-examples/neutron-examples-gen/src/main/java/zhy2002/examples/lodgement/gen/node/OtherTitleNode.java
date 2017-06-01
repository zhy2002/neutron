package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherTitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherTitleNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public OtherTitleNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherTitleNode.class;
    }

    protected final OtherTitleNodeComponent getComponent() {
        return component;
    }


    private OtherTitleNodeComponent component;

    @Inject
    void createComponent(OtherTitleNodeComponent.Builder builder) {
        this.component = builder.setOtherTitleNodeModule(new OtherTitleNodeModule(this)).build();
    }

    private RuleProvider<OtherTitleNode> getRuleProvider() {
        return component.getOtherTitleNodeRuleProvider();
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

    private RuleProvider<OtherTitleNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
