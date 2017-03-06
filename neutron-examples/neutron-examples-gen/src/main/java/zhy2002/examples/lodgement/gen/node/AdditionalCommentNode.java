package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AdditionalCommentNode extends StringUiNode<AdditionalNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AdditionalCommentNode.class;
    }

    private AdditionalCommentNodeComponent component;

    @Inject
    void createComponent(AdditionalCommentNodeComponent.Builder builder) {
        this.component = builder.setAdditionalCommentNodeModule(new AdditionalCommentNodeModule(this)).build();
    }

    private AdditionalCommentNodeRuleProvider getRuleProvider() {
        return component.getAdditionalCommentNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AdditionalCommentNode(@NotNull AdditionalNode parent, String name) {
        super(parent, name);
    }

}
