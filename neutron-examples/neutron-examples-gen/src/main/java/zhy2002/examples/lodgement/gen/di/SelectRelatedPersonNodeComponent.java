package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@SelectRelatedPersonNodeScope
@Subcomponent(modules = {SelectRelatedPersonNodeModule.class})
public interface SelectRelatedPersonNodeComponent {

    RuleProvider<SelectRelatedPersonNode> getSelectRelatedPersonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonNodeModule(SelectRelatedPersonNodeModule module);

        SelectRelatedPersonNodeComponent build();
    }
}
