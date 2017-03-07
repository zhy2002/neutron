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


public class CompanyRegistrationStateNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyRegistrationStateNode.class;
    }

    private CompanyRegistrationStateNodeComponent component;

    @Inject
    void createComponent(CompanyRegistrationStateNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegistrationStateNodeModule(new CompanyRegistrationStateNodeModule(this)).build();
    }

    private CompanyRegistrationStateNodeRuleProvider getRuleProvider() {
        return component.getCompanyRegistrationStateNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyRegistrationStateNode(@NotNull CompanyGeneralNode parent, String name) {
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
