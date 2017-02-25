package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustIndustryNodeScope
@Subcomponent(modules = {PersonTrustIndustryNodeModule.class})
public interface PersonTrustIndustryNodeComponent {

    PersonTrustIndustryNodeRuleProvider getPersonTrustIndustryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustIndustryNodeModule(PersonTrustIndustryNodeModule module);

        PersonTrustIndustryNodeComponent build();
    }
}
