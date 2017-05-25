package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessCompanyNameNodeScope
@Subcomponent(modules = {AccessCompanyNameNodeModule.class})
public interface AccessCompanyNameNodeComponent {

    RuleProvider<AccessCompanyNameNode> getAccessCompanyNameNodeRuleProvider();
    Map<String, RuleProvider<AccessCompanyNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessCompanyNameNodeModule(AccessCompanyNameNodeModule module);

        AccessCompanyNameNodeComponent build();
    }
}
