package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {SelectRelatedPersonNodeModule.class})
public interface SelectRelatedPersonNodeComponent {

    RelatedPersonReferenceNode createRelatedPersonReferenceNode();
    SelectRelatedPersonFlagNode createSelectRelatedPersonFlagNode();

    RuleProvider<SelectRelatedPersonNode> getSelectRelatedPersonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonNodeModule(SelectRelatedPersonNodeModule module);

        SelectRelatedPersonNodeComponent build();
    }

}
