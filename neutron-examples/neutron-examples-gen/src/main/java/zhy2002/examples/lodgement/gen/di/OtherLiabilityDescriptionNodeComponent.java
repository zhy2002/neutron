package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherLiabilityDescriptionNodeScope
@Subcomponent(modules = {OtherLiabilityDescriptionNodeModule.class})
public interface OtherLiabilityDescriptionNodeComponent {

    OtherLiabilityDescriptionNodeRuleProvider getOtherLiabilityDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityDescriptionNodeModule(OtherLiabilityDescriptionNodeModule module);

        OtherLiabilityDescriptionNodeComponent build();
    }
}
