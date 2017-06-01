package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AccessNodeModule.class})
public interface AccessNodeComponent {

    List<RuleProvider<AccessNode>> provideRuleProviders();

    AccessContactTypeNode createAccessContactTypeNode();
    AccessContactTitleNode createAccessContactTitleNode();
    AccessContactFirstNameNode createAccessContactFirstNameNode();
    AccessContactLastNameNode createAccessContactLastNameNode();
    AccessCompanyNameNode createAccessCompanyNameNode();
    AccessTelephoneNode createAccessTelephoneNode();
    AccessOtherDescriptionNode createAccessOtherDescriptionNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessNodeModule(AccessNodeModule module);

        AccessNodeComponent build();
    }

}
