package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomeAddBackTypeNode extends StringUiNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomeAddBackTypeNode.class;
    }

    private OtherIncomeAddBackTypeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeAddBackTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeAddBackTypeNodeModule(new OtherIncomeAddBackTypeNodeModule(this)).build();
    }

    private OtherIncomeAddBackTypeNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomeAddBackTypeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public OtherIncomeAddBackTypeNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
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
