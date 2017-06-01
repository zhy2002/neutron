package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RelatedPartyNodeModule.class})
public interface RelatedPartyNodeComponent {

    List<RuleProvider<RelatedPartyNode>> provideRuleProviders();

    ThirdPartyTypeNode createThirdPartyTypeNode();
    ThirdPartyDescriptionNode createThirdPartyDescriptionNode();
    ThirdPartyTitleNode createThirdPartyTitleNode();
    ThirdPartyFirstNameNode createThirdPartyFirstNameNode();
    ThirdPartyLastNameNode createThirdPartyLastNameNode();
    ThirdPartyDobNode createThirdPartyDobNode();
    ThirdPartyCompanyNameNode createThirdPartyCompanyNameNode();
    ThirdPartyAddressNode createThirdPartyAddressNode();
    ThirdPartyWorkPhoneNode createThirdPartyWorkPhoneNode();
    ThirdPartyEmailNode createThirdPartyEmailNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPartyNodeModule(RelatedPartyNodeModule module);

        RelatedPartyNodeComponent build();
    }

}
