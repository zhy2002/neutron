package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RelatedPersonReferenceNodeModule.class})
public interface RelatedPersonReferenceNodeComponent {

    List<RuleProvider<RelatedPersonReferenceNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPersonReferenceNodeModule(RelatedPersonReferenceNodeModule module);

        RelatedPersonReferenceNodeComponent build();
    }

}
