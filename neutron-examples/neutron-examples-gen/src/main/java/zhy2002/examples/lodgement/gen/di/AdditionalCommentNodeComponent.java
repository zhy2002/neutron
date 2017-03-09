package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AdditionalCommentNodeScope
@Subcomponent(modules = {AdditionalCommentNodeModule.class})
public interface AdditionalCommentNodeComponent {

    AdditionalCommentNodeRuleProvider getAdditionalCommentNodeRuleProvider();
    Map<String, RuleProvider<AdditionalCommentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAdditionalCommentNodeModule(AdditionalCommentNodeModule module);

        AdditionalCommentNodeComponent build();
    }
}
