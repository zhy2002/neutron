package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TitleNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public TitleNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TitleNode.class;
    }

    protected final TitleNodeComponent getComponent() {
        return component;
    }


    private TitleNodeComponent component;

    @Inject
    void createComponent(TitleNodeComponent.Builder builder) {
        this.component = builder.setTitleNodeModule(new TitleNodeModule(this)).build();
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
