package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AccessNodeModule.class})
public interface AccessNodeComponent {

    AccessContactTypeNode createAccessContactTypeNode();
    AccessContactTitleNode createAccessContactTitleNode();
    AccessContactFirstNameNode createAccessContactFirstNameNode();
    AccessContactLastNameNode createAccessContactLastNameNode();
    AccessCompanyNameNode createAccessCompanyNameNode();
    AccessTelephoneNode createAccessTelephoneNode();
    AccessOtherDescriptionNode createAccessOtherDescriptionNode();

    RuleProvider<AccessNode> getAccessNodeRuleProvider();
    Map<String, RuleProvider<AccessNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessNodeModule(AccessNodeModule module);

        AccessNodeComponent build();
    }

}
