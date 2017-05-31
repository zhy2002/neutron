package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ApplicantReferenceNodeModule.class})
public interface ApplicantReferenceNodeComponent {

    RuleProvider<ApplicantReferenceNode> getApplicantReferenceNodeRuleProvider();
    Map<String, RuleProvider<ApplicantReferenceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicantReferenceNodeModule(ApplicantReferenceNodeModule module);

        ApplicantReferenceNodeComponent build();
    }
}
