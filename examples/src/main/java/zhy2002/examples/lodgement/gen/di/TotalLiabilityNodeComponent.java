package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TotalLiabilityNodeScope
@Subcomponent(modules = {TotalLiabilityNodeModule.class})
public interface TotalLiabilityNodeComponent {

    TotalLiabilityNodeRuleProvider getTotalLiabilityNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalLiabilityNodeModule(TotalLiabilityNodeModule module);

        TotalLiabilityNodeComponent build();
    }
}
