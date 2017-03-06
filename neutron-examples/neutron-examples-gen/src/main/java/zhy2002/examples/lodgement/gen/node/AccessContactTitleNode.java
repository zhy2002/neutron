package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactTitleNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactTitleNode.class;
    }

    private AccessContactTitleNodeComponent component;

    @Inject
    void createComponent(AccessContactTitleNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTitleNodeModule(new AccessContactTitleNodeModule(this)).build();
    }

    private AccessContactTitleNodeRuleProvider getRuleProvider() {
        return component.getAccessContactTitleNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AccessContactTitleNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
