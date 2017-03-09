package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@RelatedPartyListNodeScope
@Subcomponent(modules = {RelatedPartyListNodeModule.class})
public interface RelatedPartyListNodeComponent {

    RelatedPartyListNodeRuleProvider getRelatedPartyListNodeRuleProvider();
    Map<String, RuleProvider<RelatedPartyListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyListNodeModule(RelatedPartyListNodeModule module);

        RelatedPartyListNodeComponent build();
    }
}
