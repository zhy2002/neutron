package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;

public class AppManagerNode extends ObjectUiNode<LodgementNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AppManagerNode.class;
    }

    private AppManagerNodeComponent component;

    @Inject
    void createComponent(AppManagerNodeComponent.Builder builder) {
        this.component = builder.setAppManagerNodeModule(new AppManagerNodeModule(this)).build();
    }

    @Override
    protected AppManagerNodeRuleProvider getRuleProvider() {
        return component.getAppManagerNodeRuleProvider();
    }

    public AppManagerNode(@NotNull LodgementNode parent, String name) {
        super(parent, name);
    }

}
