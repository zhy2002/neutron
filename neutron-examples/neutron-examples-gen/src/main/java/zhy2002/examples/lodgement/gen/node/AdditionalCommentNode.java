package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AdditionalCommentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AdditionalCommentNode extends StringUiNode<AdditionalNode> {

    @Inject
    public AdditionalCommentNode(@Owner AdditionalNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AdditionalCommentNode.class;
    }

    protected final AdditionalCommentNodeComponent getComponent() {
        return component;
    }


    private AdditionalCommentNodeComponent component;

    @Inject
    void createComponent(AdditionalCommentNodeComponent.Builder builder) {
        this.component = builder.setAdditionalCommentNodeModule(new AdditionalCommentNodeModule(this)).build();
    }

    private RuleProvider<AdditionalCommentNode> getRuleProvider() {
        return component.getAdditionalCommentNodeRuleProvider();
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

    private RuleProvider<AdditionalCommentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
