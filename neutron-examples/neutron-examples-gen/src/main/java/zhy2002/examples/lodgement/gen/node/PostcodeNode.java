package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PostcodeNode extends StringUiNode<AddressNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return PostcodeNode.class;
    }

    private PostcodeNodeComponent component;

    @Inject
    void createComponent(PostcodeNodeComponent.Builder builder) {
        this.component = builder.setPostcodeNodeModule(new PostcodeNodeModule(this)).build();
    }

    private RuleProvider<PostcodeNode> getRuleProvider() {
        return component.getPostcodeNodeRuleProvider();
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

    private RuleProvider<PostcodeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public PostcodeNode(@NotNull AddressNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
