package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityDescriptionNodeModule.class})
public interface OtherLiabilityDescriptionNodeComponent {

    List<RuleProvider<OtherLiabilityDescriptionNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityDescriptionNodeModule(OtherLiabilityDescriptionNodeModule module);

        OtherLiabilityDescriptionNodeComponent build();
    }

}
