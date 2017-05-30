package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherTitleNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherTitleNode.class;
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


    public OtherTitleNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
