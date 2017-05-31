package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {RelatedPartyNodeModule.class})
public interface RelatedPartyNodeComponent {

    RuleProvider<RelatedPartyNode> getRelatedPartyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyNodeModule(RelatedPartyNodeModule module);

        RelatedPartyNodeComponent build();
    }
}
