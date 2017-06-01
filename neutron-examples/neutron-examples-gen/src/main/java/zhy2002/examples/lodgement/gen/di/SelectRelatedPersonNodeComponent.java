package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SelectRelatedPersonNodeModule.class})
public interface SelectRelatedPersonNodeComponent {

    List<RuleProvider<SelectRelatedPersonNode>> provideRuleProviders();

    RelatedPersonReferenceNode createRelatedPersonReferenceNode();
    SelectRelatedPersonFlagNode createSelectRelatedPersonFlagNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonNodeModule(SelectRelatedPersonNodeModule module);

        SelectRelatedPersonNodeComponent build();
    }

}
