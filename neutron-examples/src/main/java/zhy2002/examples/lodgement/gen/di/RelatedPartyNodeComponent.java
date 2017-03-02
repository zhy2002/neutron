package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@RelatedPartyNodeScope
@Subcomponent(modules = {RelatedPartyNodeModule.class})
public interface RelatedPartyNodeComponent {

    RelatedPartyNodeRuleProvider getRelatedPartyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyNodeModule(RelatedPartyNodeModule module);

        RelatedPartyNodeComponent build();
    }
}
