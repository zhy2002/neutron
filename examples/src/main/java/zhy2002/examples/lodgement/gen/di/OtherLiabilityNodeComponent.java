package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityNodeScope
@Subcomponent(modules = {OtherLiabilityNodeModule.class})
public interface OtherLiabilityNodeComponent {

    OtherLiabilityNodeRuleProvider getOtherLiabilityNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityNodeModule(OtherLiabilityNodeModule module);

        OtherLiabilityNodeComponent build();
    }
}
