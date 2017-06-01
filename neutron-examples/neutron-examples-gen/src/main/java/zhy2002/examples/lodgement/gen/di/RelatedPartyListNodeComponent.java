package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RelatedPartyListNodeModule.class})
public interface RelatedPartyListNodeComponent {

    List<RuleProvider<RelatedPartyListNode>> provideRuleProviders();

    RelatedPartyNode createRelatedPartyNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyListNodeModule(RelatedPartyListNodeModule module);

        RelatedPartyListNodeComponent build();
    }

}
