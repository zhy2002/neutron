package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustSettlorNotRequiredReasonNodeScope
@Subcomponent(modules = {PersonTrustSettlorNotRequiredReasonNodeModule.class})
public interface PersonTrustSettlorNotRequiredReasonNodeComponent {

    PersonTrustSettlorNotRequiredReasonNodeRuleProvider getPersonTrustSettlorNotRequiredReasonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustSettlorNotRequiredReasonNodeModule(PersonTrustSettlorNotRequiredReasonNodeModule module);

        PersonTrustSettlorNotRequiredReasonNodeComponent build();
    }
}
