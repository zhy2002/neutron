package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PreviousEmploymentListNodeScope
@Subcomponent(modules = {PreviousEmploymentListNodeModule.class})
public interface PreviousEmploymentListNodeComponent {

    PreviousEmploymentListNodeRuleProvider getPreviousEmploymentListNodeRuleProvider();
    Map<String, RuleProvider<PreviousEmploymentListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentListNodeModule(PreviousEmploymentListNodeModule module);

        PreviousEmploymentListNodeComponent build();
    }
}
