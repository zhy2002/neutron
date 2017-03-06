package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@RelatedPartyListNodeScope
@Subcomponent(modules = {RelatedPartyListNodeModule.class})
public interface RelatedPartyListNodeComponent {

    RelatedPartyListNodeRuleProvider getRelatedPartyListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyListNodeModule(RelatedPartyListNodeModule module);

        RelatedPartyListNodeComponent build();
    }
}
