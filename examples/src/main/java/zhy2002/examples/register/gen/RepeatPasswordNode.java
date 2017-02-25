package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return RepeatPasswordNode.class;
    }

    private RepeatPasswordNodeComponent component;

    @Inject
    void createComponent(RepeatPasswordNodeComponent.Builder builder) {
        this.component = builder.setRepeatPasswordNodeModule(new RepeatPasswordNodeModule(this)).build();
    }

    @Override
    protected RepeatPasswordNodeRuleProvider getRuleProvider() {
        return component.getRepeatPasswordNodeRuleProvider();
    }

    public RepeatPasswordNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}
