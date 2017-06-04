package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.AreaCodeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class AreaCodeNode extends PhoneInfoFieldNode {

    @Inject
    protected AreaCodeNode(@Owner PhoneInfoNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AreaCodeNode.class;
    }

    protected final AreaCodeNodeComponent getComponent() {
        return component;
    }


    private AreaCodeNodeComponent component;

    @Inject
    void createComponent(AreaCodeNodeComponent.Builder builder) {
        this.component = builder.setAreaCodeNodeModule(new AreaCodeNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
