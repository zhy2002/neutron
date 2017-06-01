package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PostcodeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PostcodeNode extends StringUiNode<AddressNode<?>> {

    @Inject
    public PostcodeNode(@Owner AddressNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PostcodeNode.class;
    }

    protected final PostcodeNodeComponent getComponent() {
        return component;
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

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
