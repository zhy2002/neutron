package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityTypeNodeScope
@Subcomponent(modules = {OtherLiabilityTypeNodeModule.class})
public interface OtherLiabilityTypeNodeComponent {

    OtherLiabilityTypeNodeRuleProvider getOtherLiabilityTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityTypeNodeModule(OtherLiabilityTypeNodeModule module);

        OtherLiabilityTypeNodeComponent build();
    }
}
