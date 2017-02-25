package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected PostcodeNodeRuleProvider getRuleProvider() {
        return component.getPostcodeNodeRuleProvider();
    }

    public PostcodeNode(@NotNull AddressNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
        setPattern("\\d{4,4}");
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
