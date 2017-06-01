package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyAbrnNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAbrnNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyAbrnNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAbrnNode.class;
    }

    protected final CompanyAbrnNodeComponent getComponent() {
        return component;
    }


    private CompanyAbrnNodeComponent component;

    @Inject
    void createComponent(CompanyAbrnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbrnNodeModule(new CompanyAbrnNodeModule(this)).build();
    }

    private RuleProvider<CompanyAbrnNode> getRuleProvider() {
        return component.getCompanyAbrnNodeRuleProvider();
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

    private RuleProvider<CompanyAbrnNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
