package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ApplicantReferenceNodeScope
@Subcomponent(modules = {ApplicantReferenceNodeModule.class})
public interface ApplicantReferenceNodeComponent {

    ApplicantReferenceNodeRuleProvider getApplicantReferenceNodeRuleProvider();
    Map<String, RuleProvider<ApplicantReferenceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicantReferenceNodeModule(ApplicantReferenceNodeModule module);

        ApplicantReferenceNodeComponent build();
    }
}
