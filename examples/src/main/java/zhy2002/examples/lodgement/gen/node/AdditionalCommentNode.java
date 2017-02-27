package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected AdditionalCommentNodeRuleProvider getRuleProvider() {
        return component.getAdditionalCommentNodeRuleProvider();
    }

    public AdditionalCommentNode(@NotNull AdditionalNode parent, String name) {
        super(parent, name);
    }

}
