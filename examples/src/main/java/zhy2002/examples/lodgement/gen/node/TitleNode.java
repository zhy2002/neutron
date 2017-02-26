package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TitleNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TitleNode.class;
    }

    private TitleNodeComponent component;

    @Inject
    void createComponent(TitleNodeComponent.Builder builder) {
        this.component = builder.setTitleNodeModule(new TitleNodeModule(this)).build();
    }

    @Override
    protected TitleNodeRuleProvider getRuleProvider() {
        return component.getTitleNodeRuleProvider();
    }

    public TitleNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.TITLE_TYPE.toArray());
        setRequired(true);
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
